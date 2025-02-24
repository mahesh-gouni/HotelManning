package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ServicePlusDto {
    @NotNull(message = "Number of PABX consoles is required")
    private int numberOfPABXConsoles;
}
