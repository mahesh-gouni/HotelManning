package com.neoteric.HotelManningMahiDev.hotelGobalData.security.controller;


import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.security.dto.SecurityDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.security.service.SecurityService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    private SecurityService securityService;
    public SecurityController(SecurityService securityService){
        this.securityService =securityService;
    }
    @PostMapping("/creating")
    public ResponseEntity<ErrorResponse> addingSecurity(@RequestBody @Valid SecurityDto securityDto){
securityService.addingSecurity(securityDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
