package com.neoteric.HotelManningMahiDev.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "public_area_sites")
public class PublicAreaSitesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publicAreaSitesId")
    private Long id;
    @Column(name = "nameOfTheArea")
    private String nameOfTheArea;
    @Column(name = "sqMt")
    private double sqMt;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "publicAreaSiteManagerId")
    private PublicAreaSiteManagerEntity siteManager;
}
