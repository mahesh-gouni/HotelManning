package com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EngineeringDto {
    @NotNull(message = "Total number of hotel rooms is required")
    private int TotalNumberOfHotelRooms;
    @NotNull(message = "Total number of major kitchen equipments is required")
    private int TotalNumberOfMajorKitchenEquipments;
    @NotNull(message = "number of shifts is required")
    private int NumberOfShifts;
    @NotNull(message = "number of technicians per supervisor is required")
    private int NumberOfTechniciansPerSuperVisor;
}
