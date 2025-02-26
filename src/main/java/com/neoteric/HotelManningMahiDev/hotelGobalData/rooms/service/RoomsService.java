package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.service;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoomsService {
    //private final RoomsRepository roomsRepository;
    private final ModelMapper modelMapper;
    private final ConciergeRepository conciergeRepository;
    private final FrontOfficeRepository frontOfficeRepository;
    private final SpaOrFitnessAndRecreationRepository spaOrFitnessAndRecreationRepository;
    private final HouseKeepingRepository houseKeepingRepository;
    private final ServicePlusRepository servicePlusRepository;
    private final LaundryRepository laundryRepository;


@Transactional
public ResponseEntity<ErrorResponse> addingRoom(RoomsDto roomsDto){

    conciergeRepository.save(modelMapper.map(roomsDto.getConcierge(), ConciergeEntity.class));
    frontOfficeRepository.save(modelMapper.map(roomsDto.getFrontOffice(), FrontOfficeEntity.class));
    spaOrFitnessAndRecreationRepository.save(modelMapper.map(roomsDto.getSpaOrFitnessAndRecreation(), SpaOrFitnessAndRecreationEntity.class));
    houseKeepingRepository.save(modelMapper.map(roomsDto.getHouseKeeping(), HouseKeepingEntity.class));
    servicePlusRepository.save(modelMapper.map(roomsDto.getServicePlus(), ServicePlusEntity.class));
    laundryRepository.save(modelMapper.map(roomsDto.getLaundry(), LaundryEntity.class));
    return new ResponseEntity<>(HttpStatus.CREATED);

}

}
