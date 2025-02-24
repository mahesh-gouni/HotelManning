package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.service;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity.*;
import com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.repository.*;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoomsService {
    private final RoomsRepository roomsRepository;
    private final ModelMapper modelMapper;
    private final ConciergeRepository conciergeRepository;
    private final FrontOfficeRepository frontOfficeRepository;
    private final SpaOrFitnessAndRecreationRepository spaOrFitnessAndRecreationRepository;
private final HouseKeepingRepository houseKeepingRepository;
private final ServicePlusRepository servicePlusRepository;
    private final LaundryRepository laundryRepository;



    public RoomsService(RoomsRepository roomsRepository, ModelMapper modelMapper,ConciergeRepository conciergeRepository,
                        FrontOfficeRepository frontOfficeRepository, SpaOrFitnessAndRecreationRepository spaOrFitnessAndRecreationRepository,
                        HouseKeepingRepository houseKeepingRepository, ServicePlusRepository servicePlusRepository,
                        LaundryRepository laundryRepository) {
        this.roomsRepository = roomsRepository;
        this.modelMapper = modelMapper;
        this.conciergeRepository = conciergeRepository;
        this.frontOfficeRepository = frontOfficeRepository;
        this.spaOrFitnessAndRecreationRepository = spaOrFitnessAndRecreationRepository;
        this.houseKeepingRepository = houseKeepingRepository;
        this.servicePlusRepository = servicePlusRepository;
        this.laundryRepository = laundryRepository;

    }
    @Transactional
    public ResponseEntity<ErrorResponse> addingRoom(@Valid RoomsDto roomsDto) {
        // Save related entities first
        ConciergeEntity conciergeEntity = conciergeRepository.save(modelMapper.map(roomsDto.getConcierge(), ConciergeEntity.class));
        FrontOfficeEntity frontOfficeEntity = frontOfficeRepository.save(modelMapper.map(roomsDto.getFrontOffice(), FrontOfficeEntity.class));
        HouseKeepingEntity houseKeepingEntity = houseKeepingRepository.save(modelMapper.map(roomsDto.getHouseKeeping(), HouseKeepingEntity.class));
        LaundryEntity laundryEntity = laundryRepository.save(modelMapper.map(roomsDto.getLaundry(), LaundryEntity.class));
        ServicePlusEntity servicePlusEntity = servicePlusRepository.save(modelMapper.map(roomsDto.getServicePlus(), ServicePlusEntity.class));
        SpaOrFitnessAndRecreationEntity spaEntity = spaOrFitnessAndRecreationRepository.save(modelMapper.map(roomsDto.getSpaOrFitnessAndRecreation(), SpaOrFitnessAndRecreationEntity.class));


        RoomsEntity roomsEntity = modelMapper.map(roomsDto, RoomsEntity.class);
        roomsEntity.setConcierge(conciergeEntity);
        roomsEntity.setFrontOffice(frontOfficeEntity);
        roomsEntity.setHouseKeeping(houseKeepingEntity);
        roomsEntity.setLaundry(laundryEntity);
        roomsEntity.setServicePlus(servicePlusEntity);
        roomsEntity.setSpaOrFitnessAndRecreation(spaEntity);

        // Save the fully associated RoomsEntity
        roomsRepository.save(roomsEntity);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
