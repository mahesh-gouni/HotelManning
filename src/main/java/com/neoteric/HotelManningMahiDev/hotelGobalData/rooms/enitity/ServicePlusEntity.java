package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "servicePlus")
public class ServicePlusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "servicePlusId")
    private Long servicePlusId;
    @Column(name = "numberOfPABXConsoles")
    private int numberOfPABXConsoles;
//    @OneToOne(mappedBy = "servicePlus")
//    private RoomsEntity rooms;
}
