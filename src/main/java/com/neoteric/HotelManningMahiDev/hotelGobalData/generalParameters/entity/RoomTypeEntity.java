package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "room_type")
public class RoomTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomTypeId")
    private Long id;
    @Column(name = "nameOfTheArea")
    private String nameOfTheArea;
    @Column(name = "noOfkeys")
    private int keys;
    @Column(name = "bays")
    private int bays;
    @Column(name = "totalBays")
    private int totalBays;
    @Column(name = "sqMt")
    private double sqMt;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "roomTypeManagerId")
    private RoomTypeManagerEntity roomTypeManager;
}
