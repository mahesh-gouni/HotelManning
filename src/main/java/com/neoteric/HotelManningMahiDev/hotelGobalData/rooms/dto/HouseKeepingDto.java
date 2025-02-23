package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import lombok.Data;

@Data
public class HouseKeepingDto {
    private int numberOfBays;
    private  int numberGuestFloors;
    private String turnDownService;
    private int numberBaysPerRoomAttendant;
    private String publicAreaSpace;
}
