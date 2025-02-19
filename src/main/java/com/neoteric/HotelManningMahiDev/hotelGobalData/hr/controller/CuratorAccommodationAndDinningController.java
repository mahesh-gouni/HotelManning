package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.controller;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.dto.CuratorAccommodationAndDinning;
import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.service.CuratorAccommodationAndDinningService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CuratorAccommodationAndDinningController {
    private final CuratorAccommodationAndDinningService curatorAccommodationAndDinningService;

    public CuratorAccommodationAndDinningController(CuratorAccommodationAndDinningService curatorAccommodationAndDinningService){
        this.curatorAccommodationAndDinningService=curatorAccommodationAndDinningService;
    }
    public ResponseEntity<ErrorResponse> addingCurator(@RequestBody @Valid CuratorAccommodationAndDinning curatorAccommodationAndDinning) {
        curatorAccommodationAndDinningService.addingCurator(curatorAccommodationAndDinning);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
