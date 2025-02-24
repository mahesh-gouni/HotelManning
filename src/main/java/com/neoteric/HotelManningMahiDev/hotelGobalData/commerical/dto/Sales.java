package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Sales {
    @NotNull(message = "Please provide the number of segments")
    private int numberOfSegments;
}
