package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralParameters {
    private Long id;
    @NotNull(message = "Hotel Name is mandatory")

    private int noOfHotelEntrances;
    @NotBlank(message = "Hotel Name is mandatory")

    private String publicAreaSpace;
    @NotBlank(message = "Hotel publicAreaFloors is mandatory")
    private String publicAreaFloors;
    @NotNull(message = "Hotel noOfGuestFloors is mandatory")
    private int noOfGuestFloors;
    @NotNull(message = "Hotel noOfHotelRooms is mandatory")
    private int noOfHotelRooms;
    @NotNull(message = "Hotel noOfBays is mandatory")
    private int noOfBays;
    @NotNull(message = "Hotel noOfClubFloors is mandatory")
    private int noOfClubFloors;
    @NotNull(message = "Hotel noOfClubFloorRooms is mandatory")
    private int noOfClubFloorRooms;
    @NotNull(message = "Hotel AvgLengthOfStay is mandatory")
    private double avgLengthOfStay;


}
