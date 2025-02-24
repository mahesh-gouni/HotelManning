package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.controller;

import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto.CulinaryTotalDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity.CulinaryTotalEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.service.CulinaryTotalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/culinary")
@RequiredArgsConstructor
@Slf4j
public class CulinaryTotalController {
    private final CulinaryTotalService culinaryTotalService;

@PostMapping("/create")
public ResponseEntity<ApiResponse> adding(@RequestBody @Valid CulinaryTotalDto culinaryTotalDto) {
log.info("Request to add Culinary Total: {}", culinaryTotalDto);
culinaryTotalService.adding(culinaryTotalDto);
    return new ResponseEntity<>(new ApiResponse(HttpStatus.OK.value(), "Culinary Total added successfully"), HttpStatus.OK);
}

}
