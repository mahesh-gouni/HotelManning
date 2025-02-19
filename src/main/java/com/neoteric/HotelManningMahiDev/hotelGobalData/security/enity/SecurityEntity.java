package com.neoteric.HotelManningMahiDev.hotelGobalData.security.enity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "securityEntity")
@Data
public class SecurityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long securityId;
    @Column(name = "numberOfHotelEntrances")
    private int numberOfHotelEntrances;
    @Column(name = "publicAreaFloors")
    private int publicAreaFloors;
    @Column(name = "numberOfGuestFloors")
    private int numberOfGuestFloors;
    @Column(name = "numberOfCCTVCameras")
    private int numberOfCCTVCameras;
    @Column(name = "numberOfShifts")
    private int numberOfShifts;
}
