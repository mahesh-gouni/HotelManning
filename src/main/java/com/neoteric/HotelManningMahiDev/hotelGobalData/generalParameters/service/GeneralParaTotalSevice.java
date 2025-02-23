package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.service;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.generalParameters.dto.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.controller.GeneralParaTotalController;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.*;
//import com.neoteric.HotelManningMahiDev.generalParameters.repository.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository.*;
import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class GeneralParaTotalSevice {
    private static final Logger logger = Logger.getLogger(GeneralParaTotalSevice.class.getName());

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


//      @Transactional
//   public ResponseEntity<ErrorResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {
//  generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParaTotal.getGeneralParameters()));
//hotelInfoRepo.save(mapper.convertToEntityHotelInfo(generalParaTotal.getHotelInfo()));
//publicAreaSitesManagerRepo.save(mapper.convertToEntityPublicAreaSiteManager(generalParaTotal.getPublicAreaSiteManager()));
//roomTypeManagerRepo.save(mapper.convertToEntityRoomTypeManager(generalParaTotal.getRoomTypeManager()));
//leaveManagerRepo.save(mapper.convertToEntityLeavesManger(generalParaTotal.getLeavesManager()));
//generalParaTotalRepository.save(mapper.convertToEntityGeneralParaTotal(generalParaTotal));
//        return new ResponseEntity<>(HttpStatus.CREATED);
//      }


    @Transactional
    public ResponseEntity<ErrorResponse> addGeneralParaTotal(@Valid GeneralParaTotal generalParaTotal) {

        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParaTotal.getGeneralParameters()));
        hotelInfoRepo.save(mapper.convertToEntityHotelInfo(generalParaTotal.getHotelInfo()));
        PublicAreaSiteManagerEntity publicAreaSiteManager = mapper.convertToEntityPublicAreaSiteManager(generalParaTotal.getPublicAreaSiteManager());
        RoomTypeManagerEntity roomTypeManager = mapper.convertToEntityRoomTypeManager(generalParaTotal.getRoomTypeManager());
        LeavesManagerEntity leavesManager = mapper.convertToEntityLeavesManger(generalParaTotal.getLeavesManager());
        GeneralParaTotalEntity generalParaTotalEntity = mapper.convertToEntityGeneralParaTotal(generalParaTotal);
        leavesManager.getLeaves().forEach(leave -> leave.setLeavesManager(leavesManager));
        roomTypeManager.getRoomTypes().forEach(room -> room.setRoomTypeManager(roomTypeManager));
        publicAreaSiteManager.getPublicAreaSites().forEach(site -> site.setSiteManager(publicAreaSiteManager));
        publicAreaSitesManagerRepo.save(publicAreaSiteManager);
        roomTypeManagerRepo.save(roomTypeManager);
        leaveManagerRepo.save(leavesManager);
        generalParaTotalRepository.save(generalParaTotalEntity);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
