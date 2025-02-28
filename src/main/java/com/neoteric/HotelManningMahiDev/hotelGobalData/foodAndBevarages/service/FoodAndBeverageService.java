package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.service;

import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto.FoodAndBeverageTotalDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FoodAndBeverageService {


    public ResponseEntity<ApiResponse> creating(@Valid FoodAndBeverageTotalDto foodAndBeverageTotalDto) {

        return new ResponseEntity<>(new ApiResponse(HttpStatus.CREATED.value(),"food is done"),HttpStatus.CREATED);
    }
}
