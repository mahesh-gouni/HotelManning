//package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "rooms")
//public class RoomsEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long roomsId;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "frontOfficeId", referencedColumnName = "frontOfficeId")
//    private FrontOfficeEntity frontOffice;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "houseKeepingId", referencedColumnName = "houseKeepingId")
//    private HouseKeepingEntity houseKeeping;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "conciergeId", referencedColumnName = "conciergeId")
//    private ConciergeEntity concierge;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "servicePlusId", referencedColumnName = "servicePlusId")
//    private ServicePlusEntity servicePlus;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "laundryId", referencedColumnName = "laundryId")
//    private LaundryEntity laundry;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "spaOrFitnessAndRecreationId", referencedColumnName = "spaOrFitnessAndRecreationId")
//    private SpaOrFitnessAndRecreationEntity spaOrFitnessAndRecreation;
//}
