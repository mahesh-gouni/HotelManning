package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FrontOfficeDto {
    @NotNull(message = "Number of rooms is required")
    private int numberOfRooms;
    @NotNull(message = "Number of guest floors is required")
    private int numberOfGuestFloors;
    @NotNull(message = "Number of guest rooms is required")
    private int ProjectedOneYearOccupancy;
    @NotNull(message = "Number of guest rooms is required")
    private double averageLengthOfStay;
    @NotBlank(message = "Double occupancy ratio is required")
    private String doubleOccupancyRatio;
    @NotNull(message = "Average number of in-house guests is required")
    private double averageNumberOfInHouseGuests;
    @NotNull(message = "Average number of daily check-ins is required")
    private double dailyCheckIn;
    @NotNull(message = "Average number of daily check-outs is required")
    private double dailyCheckOut;
    @NotNull(message = "Average number of daily arrivals is required")
    private int clubFloors;
    @NotNull(message = "Average number of daily departures is required")
    private int clubFloorRooms;
    @NotNull(message = "Average number of daily arrivals is required")
    private int shifts;
}
