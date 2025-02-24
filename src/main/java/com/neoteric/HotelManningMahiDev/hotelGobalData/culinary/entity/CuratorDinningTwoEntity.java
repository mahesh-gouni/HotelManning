package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "curatorDinningTwo")
public class CuratorDinningTwoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curatorDinningTwoId")
    private Long curatorDinningTwoId;
    @Column(name = "numberOfKitchensConsideredForStewarding")
    private int numberOfKitchensConsideredForStewarding;
    @Column(name = "selectKitchenForStewarding")
    private String selectKitchenForStewarding;
    @OneToOne(mappedBy = "curatorDinningTwoEntity")
    private CulinaryTotalEntity culinaryTotalEntity;
}
