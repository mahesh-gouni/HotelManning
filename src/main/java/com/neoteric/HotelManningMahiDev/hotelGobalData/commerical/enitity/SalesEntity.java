package com.neoteric.HotelManningMahiDev.hotelGobalData.commerical.enitity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sales")
public class SalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesId")
    private Long salesId;
    @Column(name = "numberOfSegments")
    private int numberOfSegments;
//    @OneToOne(mappedBy = "salesEntity")
//    private CommercialEntity commercialEntity;
}
