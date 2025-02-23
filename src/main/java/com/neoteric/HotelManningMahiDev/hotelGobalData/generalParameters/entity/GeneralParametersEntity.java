package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "general_parameters")
@Data

public class GeneralParametersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "generalParametersId")
    private Long id;
    @Column(name ="noOfHotelEntrances" )
    private int noOfHotelEntrances;
    @Column(name ="publicAreaSpace" )
    private String publicAreaSpace;
    @Column(name ="publicAreaFloors" )
    private String publicAreaFloors;
    @Column(name ="noOfGuestFloors" )
    private int noOfGuestFloors;
    @Column(name ="noOfHotelRooms" )
    private int noOfHotelRooms;
    @Column(name ="noOfBays" )
    private int noOfBays;
    @Column(name ="noOfClubFloors" )
    private int noOfClubFloors;
    @Column(name ="noOfClubFloorRooms" )
    private int noOfClubFloorRooms;
    @Column(name ="avgLengthOfStay" )
    private double avgLengthOfStay;
    @OneToOne(mappedBy = "generalParameters")
    private GeneralParaTotalEntity generalParaTotalEntity;
}
