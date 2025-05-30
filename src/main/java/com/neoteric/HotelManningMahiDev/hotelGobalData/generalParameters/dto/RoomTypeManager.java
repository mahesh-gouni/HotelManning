package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomTypeManager {
    private Long id;
    private List<RoomType> roomTypes;
    private String total;
}
