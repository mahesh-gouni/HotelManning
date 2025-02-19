package com.neoteric.HotelManningMahiDev.hotelGobalData.security.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SecurityDto {
    @NotNull(message = "numberOfHotelEntrances should not be null")
    private int numberOfHotelEntrances;
    @NotNull(message = "publicAreaFloors should not be null")
    private int publicAreaFloors;
    @NotNull(message = "numberOfGuestFloors should not be null")
    private int numberOfGuestFloors;
    @NotNull(message = "numberOfCCTVCameras should not be null")
    private int numberOfCCTVCameras;
    @NotNull(message = "numberOfShifts should not be null")
    private int numberOfShifts;
}
