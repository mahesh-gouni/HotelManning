package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "curatorDinning")
public class CuratorDinningEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curatorDinningId")
    private Long curatorDinningId;
    @Column(name = "numberOfProjectedDailyCoversInCuratorDinning")
    private int numberOfProjectedDailyCoversInCuratorDinning;
    @Column(name = "projectedSeating")
    private int projectedSeating;
//    @OneToOne(mappedBy = "curatorDinningEntity")
//    private CulinaryTotalEntity culinaryTotalEntity;
}
