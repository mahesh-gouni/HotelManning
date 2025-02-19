package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
    private Long id;
    private String leaveType;
    private int noOfDays;

}
