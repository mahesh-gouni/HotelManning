package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity;

import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.RoomsOrFandBReservations;
import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.Sales;
import jakarta.persistence.*;

@Entity
@Table(name = "CommercialEntity")
public class CommercialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commercialId;
    @OneToOne
    @JoinColumn(name = "salesId",referencedColumnName = "salesId")
   private SalesEntity salesEntity;
    @OneToOne
    @JoinColumn(name = "RoomsOrFandBReservationsId",referencedColumnName = "RoomsOrFandBReservationsId")
   private RoomsOrFandBReservationsEntity roomsOrFandBReservationsEntity;
}
