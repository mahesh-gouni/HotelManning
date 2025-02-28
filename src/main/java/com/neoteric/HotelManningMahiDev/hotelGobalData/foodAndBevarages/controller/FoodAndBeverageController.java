package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.controller;


import com.neoteric.HotelManningMahiDev.exceptions.ApiResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto.FoodAndBeverageTotalDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.service.FoodAndBeverageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/FoodAndBeverage")
@RequiredArgsConstructor
public class FoodAndBeverageController {
private final FoodAndBeverageService foodAndBeverageService;

    public ResponseEntity<ApiResponse> creating(@Valid @RequestBody FoodAndBeverageTotalDto foodAndBeverageTotalDto){

        foodAndBeverageService.creating(foodAndBeverageTotalDto);

        return new ResponseEntity<>(new ApiResponse(HttpStatus.CREATED.value(),"food is created"),HttpStatus.CREATED);
    }

}
