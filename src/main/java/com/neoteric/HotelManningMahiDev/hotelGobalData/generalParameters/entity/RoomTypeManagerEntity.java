package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "room_type_manager")
public class RoomTypeManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomTypeManagerId")
    private Long id;

    @OneToMany(mappedBy = "roomTypeManager", cascade = CascadeType.ALL)

    private List<RoomTypeEntity> roomTypes = new ArrayList<>();
    @Column(name = "total")
    private String total;

//    @OneToOne(mappedBy = "roomTypeManager")
//    private GeneralParaTotalEntity generalParaTotal;
}
