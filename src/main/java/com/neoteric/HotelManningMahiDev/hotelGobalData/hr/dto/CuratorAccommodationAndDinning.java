package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.dto;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
public class CuratorAccommodationAndDinning {
    @NotNull(message = "Accommodation and Dinning data is required")
    private int numberOfAccommodationFacilities;
    @NotNull(message = "Accommodation and Dinning data is required")
    private int numberOfShiftsInFacilities;
    @NotNull(message = "Total number of projected covers per day is required")
    private int totalNumberOfProjectedCoversPerDay;

}
