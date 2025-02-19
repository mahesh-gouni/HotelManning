package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.controller;


import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.GeneralParaTotal;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.service.GeneralParaTotalSevice;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/generalParaTotal")
public class GeneralParaTotalController {

    private final GeneralParaTotalSevice generalParaTotalSevice;

    public GeneralParaTotalController(GeneralParaTotalSevice generalParaTotalSevice) {
        this.generalParaTotalSevice = generalParaTotalSevice;
    }

    @PostMapping("/create")
    public ResponseEntity<ErrorResponse> addGeneralParaTotal(@RequestBody @Valid GeneralParaTotal generalParaTotal) {
        generalParaTotalSevice.addGeneralParaTotal(generalParaTotal);
       //ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.OK.value(), "Internal Server Error", ex.getMessage());
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
