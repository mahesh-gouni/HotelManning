package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelInfo {
    private Long id;
    private String hotelName;
    private boolean isItFiveStar;
    private boolean isItStandaloneHotel;
    private int headCountForIBU;
    private int headCountForFBUInCluster;
    private int ProjectedEmpHeadCount;

}
