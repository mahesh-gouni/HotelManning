//package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity;
//
//import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.RoomsOrFandBReservations;
//import com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.dto.Sales;
//import jakarta.persistence.*;
//import lombok.Data;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//
//@Entity
//@Table(name = "CommercialEntity")
//@Data
//public class CommercialEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long commercialId;
////    @OneToOne
////    @JoinColumn(name = "salesId",referencedColumnName = "salesId")
//  //  @Column(name = "salesId")
//@JdbcTypeCode(SqlTypes.JSON)
//   private SalesEntity salesEntity;
////    @OneToOne
////    @JoinColumn(name = "RoomsOrFandBReservationsId",referencedColumnName = "RoomsOrFandBReservationsId")
//@JdbcTypeCode(SqlTypes.JSON)
//    @Column(name = "RoomsOrFandBReservationsId")
//   private RoomsOrFandBReservationsEntity roomsOrFandBReservationsEntity;
//}
