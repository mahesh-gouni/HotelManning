package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "frontOffice")
public class FrontOfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "frontOfficeId")
    private Long frontOfficeId;
    @Column(name = "numberOfRooms")
    private int numberOfRooms;
    @Column(name="numberOfGuestFloors")
    private int numberOfGuestFloors;
    @Column(name="ProjectedOneYearOccupancy")
    private int ProjectedOneYearOccupancy;
    @Column(name="averageLengthOfStay")
    private Double averageLengthOfStay;
    @Column(name="doubleOccupancyRatio")
    private String doubleOccupancyRatio;
    @Column(name = "averageNumberOfInHouseGuests")
    private Double averageNumberOfInHouseGuests;
    @Column(name = "dailyCheckIn")
    private Double dailyCheckIn;
    @Column(name = "dailyCheckOut")
    private Double dailyCheckOut;
    @Column(name = "clubFloors")
    private int clubFloors;
    @Column(name = "clubFloorRooms")
    private int clubFloorRooms;
    @Column(name = "shifts")
    private int shifts;

@OneToOne(mappedBy = "frontOffice")
    private RoomsEntity roomsEntity;

}
