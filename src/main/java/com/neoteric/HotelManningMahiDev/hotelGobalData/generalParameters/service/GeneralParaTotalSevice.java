package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.service;

import com.neoteric.HotelManningMahiDev.aop.TrackExecutionTime;
import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.GeneralParaTotal;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.Leave;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.PublicAreaSites;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.RoomType;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class GeneralParaTotalSevice {
    private static final Logger logger = Logger.getLogger(GeneralParaTotalSevice.class.getName());

    // private final MapperPointer mapper;
    private final ModelMapper modelMapper;
    //  private final GeneralParaTotalRepository generalParaTotalRepository;
    private final GeneralParametersRepo generalParametersRepo;
    private final HotelInfoRepo hotelInfoRepo;
    private final LeaveRepo leaveRepo;
    private final LeaveManagerRepo leaveManagerRepo;
    private final PublicAreaSitesManagerRepo publicAreaSitesManagerRepo;
    private final RoomTypeManagerRepo roomTypeManagerRepo;
    private final RoomTypeRepo roomTypeRepo;
    private final PublicAreaSitesRepo publicAreaSitesRepo;

//
//    public GeneralParaTotalSevice(MapperPointer mapper, GeneralParaTotalRepository generalParaTotalRepository,
//                                  GeneralParametersRepo generalParametersRepo, HotelInfoRepo hotelInfoRepo, LeaveRepo leaveRepo,
//                                  LeaveManagerRepo leaveManagerRepo, PublicAreaSitesManagerRepo publicAreaSitesManagerRepo,
//                                  RoomTypeManagerRepo roomTypeManagerRepo, RoomTypeRepo roomTypeRepo, PublicAreaSitesRepo publicAreaSitesRepo
//    ) {
//        this.mapper = mapper;
//        this.generalParaTotalRepository = generalParaTotalRepository;
//        this.generalParametersRepo = generalParametersRepo;
//        this.hotelInfoRepo = hotelInfoRepo;
//        this.leaveRepo = leaveRepo;
//        this.leaveManagerRepo = leaveManagerRepo;
//        this.publicAreaSitesManagerRepo = publicAreaSitesManagerRepo;
//        this.roomTypeManagerRepo = roomTypeManagerRepo;
//        this.roomTypeRepo = roomTypeRepo;
//        this.publicAreaSitesRepo = publicAreaSitesRepo;
//    }


//    @Transactional
//    public ResponseEntity<ErrorResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {
//
//        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParaTotal.getGeneralParameters()));
//        hotelInfoRepo.save(mapper.convertToEntityHotelInfo(generalParaTotal.getHotelInfo()));
//        PublicAreaSiteManagerEntity publicAreaSiteManager = mapper.convertToEntityPublicAreaSiteManager(generalParaTotal.getPublicAreaSiteManager());
//        RoomTypeManagerEntity roomTypeManager = mapper.convertToEntityRoomTypeManager(generalParaTotal.getRoomTypeManager());
//        LeavesManagerEntity leavesManager = mapper.convertToEntityLeavesManger(generalParaTotal.getLeavesManager());
//        GeneralParaTotalEntity generalParaTotalEntity = mapper.convertToEntityGeneralParaTotal(generalParaTotal);
//        leavesManager.getLeaves().forEach(leave -> leave.setLeavesManager(leavesManager));
//        roomTypeManager.getRoomTypes().forEach(room -> room.setRoomTypeManager(roomTypeManager));
//        publicAreaSiteManager.getPublicAreaSites().forEach(site -> site.setSiteManager(publicAreaSiteManager));
//        publicAreaSitesManagerRepo.save(publicAreaSiteManager);
//        roomTypeManagerRepo.save(roomTypeManager);
//        leaveManagerRepo.save(leavesManager);
//        generalParaTotalRepository.save(generalParaTotalEntity);
//
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }

    @Transactional
    @TrackExecutionTime
    public ResponseEntity<ApiResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {
        generalParametersRepo.save(modelMapper.map(generalParaTotal.getGeneralParameters(), GeneralParametersEntity.class));
        hotelInfoRepo.save(modelMapper.map(generalParaTotal.getHotelInfo(), HotelInfoEntity.class));
//      List<Leave> leave = generalParaTotal.getLeavesManager().getLeaves();
        List<Leave> leaveList = generalParaTotal.getLeavesManager().getLeaves();
        // Map Leave list to LeaveEntity list and ensure a fresh copy
        List<LeaveEntity> leaveEntities = new ArrayList<>(modelMapper.map(leaveList, new TypeToken<List<LeaveEntity>>() {
        }.getType()));

        // Create LeavesManagerEntity and set its fields
        LeavesManagerEntity leavesManagerEntity = new LeavesManagerEntity();
        leavesManagerEntity.setLeaves(leaveEntities);
        leavesManagerEntity.setRelieverFactor(generalParaTotal.getLeavesManager().getRelieverFactor());
        leavesManagerEntity.setTotal(generalParaTotal.getLeavesManager().getTotal());

        // Set LeavesManagerEntity reference inside LeaveEntity to maintain bidirectional relationship
        for (LeaveEntity leaveEntity : leaveEntities) {
            leaveEntity.setLeavesManager(leavesManagerEntity);
        }
        leaveManagerRepo.save(leavesManagerEntity);

        leaveRepo.saveAll(new ArrayList<>(leaveEntities));


        List<PublicAreaSites> publicAreaSitesList = generalParaTotal.getPublicAreaSiteManager().getPublicAreaSites();

        List<PublicAreaSitesEntity> publicAreaSitesEntities = new ArrayList<>(modelMapper.map(publicAreaSitesList, new TypeToken<List<PublicAreaSitesEntity>>() {
        }.getType()));
        PublicAreaSiteManagerEntity publicAreaSiteManagerEntity = new PublicAreaSiteManagerEntity();
        publicAreaSiteManagerEntity.setPublicAreaSites(publicAreaSitesEntities);
        publicAreaSiteManagerEntity.setTotal(generalParaTotal.getPublicAreaSiteManager().getTotal());

        for (PublicAreaSitesEntity publicAreaSitesEntity : publicAreaSitesEntities) {

            publicAreaSitesEntity.setSiteManager(publicAreaSiteManagerEntity);
        }
        publicAreaSitesManagerRepo.save(publicAreaSiteManagerEntity);
        publicAreaSitesRepo.saveAll(new ArrayList<>(publicAreaSitesEntities));


        List<RoomType> roomTypes = generalParaTotal.getRoomTypeManager().getRoomTypes();

        List<RoomTypeEntity> roomTypeEntities = new ArrayList<>(modelMapper.map(roomTypes, new TypeToken<List<RoomTypeEntity>>() {
        }.getType()));
        RoomTypeManagerEntity roomTypeManagerEntity = new RoomTypeManagerEntity();
        roomTypeManagerEntity.setRoomTypes(roomTypeEntities);
        roomTypeManagerEntity.setTotal(generalParaTotal.getRoomTypeManager().getTotal());

        for (RoomTypeEntity roomTypeEntity : roomTypeEntities) {
            roomTypeEntity.setRoomTypeManager(roomTypeManagerEntity);

        }

        roomTypeManagerRepo.save(roomTypeManagerEntity);
        roomTypeRepo.saveAll(new ArrayList<>(roomTypeEntities));
        return new ResponseEntity<>(new ApiResponse(HttpStatus.OK.value(), "created products"), HttpStatus.CREATED);
    }
}
