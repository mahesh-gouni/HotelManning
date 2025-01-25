package com.neoteric.HotelManningMahiDev.generalParameters.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeavesManger {
    private List<Leave> leaves;
    private String total;
    private String relieverFactor;
}
