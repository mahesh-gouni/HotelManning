//package com.neoteric.HotelManningMahiDev.generalParameters.service;
//
//
//
//import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.generalParameters.dto.GeneralParameters;
//import com.neoteric.HotelManningMahiDev.generalParameters.repository.GeneralParametersRepo;
//import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public class GeneralParametersService {
//    private MapperPointer mapper;
//    private GeneralParametersRepo generalParametersRepo;
//    public GeneralParametersService(GeneralParametersRepo generalParametersRepo, MapperPointer mapper){
//        this.generalParametersRepo=generalParametersRepo;
//        this.mapper=mapper;
//    }
//
//    public ResponseEntity<ErrorResponse> addGeneralParameters(GeneralParameters generalParameters) {
//        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParameters));
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
//}
