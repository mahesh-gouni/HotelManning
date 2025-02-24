package com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.controller;

import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.dto.EngineeringDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.service.EngineeringService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/engineering")
public class EngineeringController {
    private final EngineeringService engineeringService;
    public EngineeringController(EngineeringService engineeringService){
        this.engineeringService=engineeringService;
    }
    @PostMapping("/create")
    public ResponseEntity<ApiResponse> addingRoom(@RequestBody @Valid EngineeringDto engineering) {
        engineeringService.addingRoom(engineering);
        return new ResponseEntity<>( new ApiResponse(HttpStatus.OK.value(), "engineering created"), HttpStatus.OK);
    }
}
