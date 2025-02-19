package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.controller;



import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.exceptions.MicroResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.GeneralParameters;
import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.service.GeneralParametersService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/generalParameters")
public class GeneralParametersController {
    private static final Logger logger = Logger.getLogger(GeneralParametersController.class.getName());

    private GeneralParametersService generalParametersService;
    public GeneralParametersController(GeneralParametersService GeneralParametersService) {
        this.generalParametersService = GeneralParametersService;
    }

    @PostMapping("/create")
    public ResponseEntity<ErrorResponse> addGeneralParameters(@RequestBody @Valid GeneralParameters generalParameters) {
        logger.info("General Parameters received: " + generalParameters);
        generalParametersService.addGeneralParameters(generalParameters);
       // ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error", ex.getMessage());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/micro/{id}")
    public ResponseEntity<MicroResponse> getGeneralParameters(@PathVariable Long id) {
        try {
            // Call the service method to fetch GeneralParameters and Product
           ResponseEntity< MicroResponse> microResponse = generalParametersService.geetingGeneralParameters(id);
            return new ResponseEntity<>(microResponse.getBody(),HttpStatus.CREATED);
        } catch (RuntimeException ex) {
            // Handle the error and return an appropriate response
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
