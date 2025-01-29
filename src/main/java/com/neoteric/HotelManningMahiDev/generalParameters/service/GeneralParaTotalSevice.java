package com.neoteric.HotelManningMahiDev.generalParameters.service;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.generalParameters.dto.*;
import com.neoteric.HotelManningMahiDev.generalParameters.entity.LeaveEntity;
import com.neoteric.HotelManningMahiDev.generalParameters.repository.*;
import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneralParaTotalSevice {
    private final MapperPointer mapper;
    private final GeneralParaTotalRepository generalParaTotalRepository;
    private final GeneralParametersRepo generalParametersRepo;
    private final HotelInfoRepo hotelInfoRepo;
    private final LeaveRepo leaveRepo;
    private final LeaveManagerRepo leaveManagerRepo;
    private final PublicAreaSitesManagerRepo publicAreaSitesManagerRepo;
    private final RoomTypeManagerRepo roomTypeManagerRepo;
    private final RoomTypeRepo roomTypeRepo;
    private final PublicAreaSitesRepo publicAreaSitesRepo;


    public GeneralParaTotalSevice(MapperPointer mapper, GeneralParaTotalRepository generalParaTotalRepository,
                                  GeneralParametersRepo generalParametersRepo, HotelInfoRepo hotelInfoRepo, LeaveRepo leaveRepo,
                                  LeaveManagerRepo leaveManagerRepo, PublicAreaSitesManagerRepo publicAreaSitesManagerRepo,
                                  RoomTypeManagerRepo roomTypeManagerRepo, RoomTypeRepo roomTypeRepo, PublicAreaSitesRepo publicAreaSitesRepo
    ) {
        this.mapper = mapper;
        this.generalParaTotalRepository = generalParaTotalRepository;
        this.generalParametersRepo = generalParametersRepo;
        this.hotelInfoRepo = hotelInfoRepo;
        this.leaveRepo = leaveRepo;
        this.leaveManagerRepo = leaveManagerRepo;
        this.publicAreaSitesManagerRepo = publicAreaSitesManagerRepo;
        this.roomTypeManagerRepo = roomTypeManagerRepo;
        this.roomTypeRepo = roomTypeRepo;
        this.publicAreaSitesRepo = publicAreaSitesRepo;
    }


    @Transactional
    public ResponseEntity<ErrorResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {
        GeneralParameters generalParameters = generalParaTotal.getGeneralParameters();
        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParameters));
        HotelInfo hotelInfo = generalParaTotal.getHotelInfo();
        hotelInfoRepo.save(mapper.convertToEntityHotelInfo(hotelInfo));
        PublicAreaSiteManager publicAreaSiteManager = generalParaTotal.getPublicAreaSiteManager();
       publicAreaSitesManagerRepo.save(mapper.convertToEntityPublicAreaSiteManager(publicAreaSiteManager));
        RoomTypeManager roomTypeManager = generalParaTotal.getRoomTypeManager();
        roomTypeManagerRepo.save(mapper.convertToEntityRoomTypeManager(roomTypeManager));
        LeavesManager leavesManager = generalParaTotal.getLeavesManager();
       leaveManagerRepo.save(mapper.convertToEntityLeavesManger(leavesManager));

//        GeneralParaTotal generalParaTotal1 = new GeneralParaTotal();
//        generalParaTotal1.setGeneralParameters(generalParameters);
       // generalParaTotal1.setHotelInfo(hotelInfo);
//        generalParaTotal1.setPublicAreaSiteManager(publicAreaSiteManager);
//        generalParaTotal1.setRoomTypeManager(roomTypeManager);
//        generalParaTotal1.setLeavesManager(leavesManager);

        generalParaTotalRepository.save(mapper.convertToEntityGeneralParaTotal(generalParaTotal));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


//    public ResponseEntity<ErrorResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {
//        GeneralParameters generalParameters = generalParaTotal.getGeneralParameters();
//        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParameters));
//
//        HotelInfo hotelInfo = generalParaTotal.getHotelInfo();
//        hotelInfoRepo.save(mapper.convertToEntityHotelInfo(hotelInfo));
//
//        PublicAreaSiteManager publicAreaSiteManager = generalParaTotal.getPublicAreaSiteManager();
////       List<PublicAreaSites> publicAreaSites = publicAreaSiteManager.getPublicAreaSites();
////        publicAreaSites.stream()
////                .map(mapper::convertToEntityPublicAreaSites)
////                .forEach(publicAreaSitesRepo::save);
//
//            publicAreaSitesManagerRepo.save(mapper.convertToEntityPublicAreaSiteManager(publicAreaSiteManager));
//            RoomTypeManager roomTypeManager = generalParaTotal.getRoomTypeManager();
//            roomTypeManagerRepo.save(mapper.convertToEntityRoomTypeManager(roomTypeManager));
//            LeavesManager leavesManager = generalParaTotal.getLeavesManager();
//
//            leaveManagerRepo.save(mapper.convertToEntityLeavesManger(leavesManager));
//            return new ResponseEntity<>(HttpStatus.CREATED);
//
//
//        }



    }
