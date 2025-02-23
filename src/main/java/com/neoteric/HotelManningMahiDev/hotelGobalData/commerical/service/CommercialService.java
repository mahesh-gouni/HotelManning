package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.service;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.controller.CommercialController;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.CommercialDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.RoomsOrFandBReservations;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.Sales;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.CommercialEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.RoomsOrFandBReservationsEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity.SalesEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.CommercialRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.RoomsOrFandBReservationsRepository;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.repository.SalesRepository;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommercialService {
    private static final Logger logger = Logger.getLogger(CommercialService.class.getName());
private final CommercialRepository commercialRepository;
private final ModelMapper modelMapper;
private final RoomsOrFandBReservationsRepository roomsOrFandBReservationsRepository;
private final SalesRepository salesRepository;
    public CommercialService(CommercialRepository commercialRepository,ModelMapper modelMapper,RoomsOrFandBReservationsRepository roomsOrFandBReservationsRepository
   , SalesRepository salesRepository){
        this.commercialRepository =commercialRepository;
        this.modelMapper=modelMapper;
        this.roomsOrFandBReservationsRepository=roomsOrFandBReservationsRepository;
        this.salesRepository=salesRepository;
    }
    public ResponseEntity<ErrorResponse> addinCommercial(@Valid CommercialDto commercialDto) {
        logger.info("Commercial received: " + commercialDto);
      RoomsOrFandBReservations roomsOrFandBReservations= commercialDto.getRoomsOrFandBReservations();
      logger.info("RoomsOrFandBReservations received: " + roomsOrFandBReservations);
       RoomsOrFandBReservationsEntity roomsOrFandBReservationsEntity= modelMapper.map(roomsOrFandBReservations,RoomsOrFandBReservationsEntity.class);
       logger.info("RoomsOrFandBReservationsEntity received: " + roomsOrFandBReservationsEntity);
        roomsOrFandBReservationsRepository.save(roomsOrFandBReservationsEntity);
      Sales sales =commercialDto.getSales();
        SalesEntity salesEntity = modelMapper.map(sales,SalesEntity.class);
        salesRepository.save(salesEntity);
        CommercialEntity commercial = modelMapper.map(commercialDto, CommercialEntity.class);

       commercialRepository.save(commercial);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
