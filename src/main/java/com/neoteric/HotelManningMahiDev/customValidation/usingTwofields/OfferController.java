package com.neoteric.HotelManningMahiDev.customValidation.usingTwofields;

import com.neoteric.HotelManningMahiDev.customValidation.usingSecondMethodForTwoFileds.MyDto;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/offers")
public class OfferController {

    @Autowired
    private OfferService offerService;

//    @PostMapping("/create")
//    public ResponseEntity<ErrorResponse> createOffer(@Valid @RequestBody OfferDto offerDto) {
//        System.out.println("OfferController.createOffer"+offerDto);
//        OfferDto createdOffer = offerService.createOffer(offerDto);
//        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_ACCEPTABLE.value(),"invalid details","invalid details");
//        return new ResponseEntity<>( errorResponse,HttpStatus.CREATED);
//    }

    @PostMapping("/create")
    public ResponseEntity<?> createOffer(@Valid @RequestBody OfferDto offerDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Log the errors to verify they're being captured
            bindingResult.getAllErrors().forEach(error -> System.out.println("Error: " + error.getDefaultMessage()));
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        // Proceed with normal logic if valid
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/mahi")
    public ResponseEntity<?> createOffer(@Valid @RequestBody MyDto myDto) {
        // Perform the offer creation logic here
        return ResponseEntity.ok("Offer created successfully");
    }
}