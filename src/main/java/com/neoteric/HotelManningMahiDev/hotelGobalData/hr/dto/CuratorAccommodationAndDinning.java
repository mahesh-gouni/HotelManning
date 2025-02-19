package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.dto;

import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
public class CuratorAccommodationAndDinning {
    private int numberOfAccommodationFacilities;
    private int numberOfShiftsInFacilities;
    private int totalNumberOfProjectedCoversPerDay;


}
