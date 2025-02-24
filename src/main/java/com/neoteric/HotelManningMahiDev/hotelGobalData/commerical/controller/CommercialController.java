package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.controller;


import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.CommercialDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.service.CommercialService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/commercial")
public class CommercialController {
 private final CommercialService commercialService;
    private static final Logger logger = Logger.getLogger(CommercialController.class.getName());

public CommercialController(CommercialService commercialService){
    this.commercialService=commercialService;
}

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> addingCommercial(@RequestBody @Valid CommercialDto commercialDto){
        logger.info("Commercial received: " + commercialDto);
    commercialService.addinCommercial(commercialDto);

        return new ResponseEntity<>( new ApiResponse(HttpStatus.OK.value(), "Commercial is created"),HttpStatus.CREATED);
    }



}
