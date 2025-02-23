package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RoomsOrFandBReservations")
public class RoomsOrFandBReservationsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomsOrFandBReservationsId")
    private Long RoomsOrFandBReservationsId;
    @Column(name = "numberOfProjectectedRoomReservations")
    private int numberOfProjectectedRoomReservations;
    @Column(name = "totalNumberOfCallsExpected")
    private  int totalNumberOfCallsExpected;
    @Column(name ="totalNumberOfRestaurantsRequiring")
    private int totalNumberOfRestaurantsRequiring;
    @Column(name = "numberOfShiftsInRestaurantReservations")
    private int numberOfShiftsInRestaurantReservations;
    @Column(name = "numberOfAdvisorsPerTeamLeader")
    private int numberOfAdvisorsPerTeamLeader;
    @OneToOne(mappedBy = "roomsOrFandBReservationsEntity")
    private CommercialEntity commercialEntity;

}
