//package com.neoteric.HotelManningMahiDev.generalParameters.controller;
//
//
//import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.generalParameters.dto.HotelInfo;
//import com.neoteric.HotelManningMahiDev.generalParameters.service.HotelInfoService;
//import jakarta.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api/hotelInfo")
//public class HotelInfoController {
//    private static final Logger logger = LoggerFactory.getLogger(HotelInfoController.class);
//    private HotelInfoService hotelInfoService;
//    public HotelInfoController(HotelInfoService HotelInfoService) {
//        this.hotelInfoService = HotelInfoService;
//
//    }
//
//    @PostMapping("/addHotelInfo")
//    public ResponseEntity<ErrorResponse> addHotelInfo(@RequestBody @Valid HotelInfo hotelInfo) {
//logger.info("Adding hotel info"+hotelInfo);
// hotelInfoService.addHotelInfo(hotelInfo);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//}
