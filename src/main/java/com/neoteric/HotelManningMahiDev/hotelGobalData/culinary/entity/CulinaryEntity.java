package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "culinary")
public class CulinaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "culinaryId")
    private Long culinaryId;
    @Column(name = "numberOfOutlets")
    private int numberOfOutlets;
    @Column(name = "levels")
    private String levels;
    @Column(name = "mainKitchenSections")
    private String mainKitchenSections;
    @ElementCollection
    @CollectionTable(name = "culinary_kitchen_sections", joinColumns = @JoinColumn(name = "culinaryId"))
    @Column(name = "kitchen_section_name")
    private List<String> kitchenSectionNames =new ArrayList<>();
    @Column(name = "numberOfProjectedDailyCoversServedByMainKitchen")
    private int numberOfProjectedDailyCoversServedByMainKitchen;
    @Column(name = "numberOfShifts")
    private int numberOfShifts;

    @OneToOne(mappedBy = "culinaryEntity")
    private CulinaryTotalEntity culinaryTotalEntity;
}
