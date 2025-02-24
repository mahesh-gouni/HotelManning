package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ConciergeDto {
    @NotNull(message = " average daily pick up per drop requirement is required")
    private double averageDailyPickUpPerDropRequirement;
    @NotNull(message = "average daily pick up per drop numbers is required")
    private double averageDailyPickUpPerDropNumbers;

}
