package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import lombok.Data;

@Data
public class FrontOfficeDto {
    private int numberOfRooms;
    private int numberOfGuestFloors;
    private int ProjectedOneYearOccupancy;
    private double averageLengthOfStay;
    private String doubleOccupancyRatio;
    private double averageNumberOfInHouseGuests;
    private double dailyCheckIn;
    private double dailyCheckOut;
    private int clubFloors;
    private int clubFloorRooms;
    private int shifts;
}
