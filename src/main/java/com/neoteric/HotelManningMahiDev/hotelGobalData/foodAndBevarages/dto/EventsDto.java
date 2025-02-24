package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EventsDto {
    @NotNull(message = "Please provide the number of segments")
    private int numberOfSegmentsCorporate;
}
