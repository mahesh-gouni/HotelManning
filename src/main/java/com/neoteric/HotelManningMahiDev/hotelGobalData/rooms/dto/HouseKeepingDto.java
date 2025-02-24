package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HouseKeepingDto {
    @NotNull(message = "Number of bays is required")
    private int numberOfBays;
    @NotNull(message = "Number of guest floors is required")
    private  int numberGuestFloors;
    @NotBlank(message = "Number of guest rooms is required")
    private String turnDownService;
    @NotNull(message = "Number of guest rooms is required")
    private int numberBaysPerRoomAttendant;
    @NotBlank(message = "Number of guest rooms is required")
    private String publicAreaSpace;
}
