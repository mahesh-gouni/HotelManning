package com.neoteric.HotelManningMahiDev.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicAreaSiteManger {
    private List<PublicAreaSites> publicAreaSites;
    private String total;
}
