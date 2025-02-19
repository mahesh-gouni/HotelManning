package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "public_area_site_manager")
public class PublicAreaSiteManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publicAreaSiteManagerId")
    private Long id;

    @OneToMany(mappedBy = "siteManager", cascade = CascadeType.ALL)
    private List<PublicAreaSitesEntity> publicAreaSites = new ArrayList<>();
    @Column(name = "total")
    private String total;

    @OneToOne(mappedBy = "publicAreaSiteManager")
    private GeneralParaTotalEntity generalParaTotal;
}
