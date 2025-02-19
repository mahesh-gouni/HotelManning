package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "general_para_total")
public class GeneralParaTotalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "generalParametersTotalId")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelInfoId")
    private HotelInfoEntity hotelInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "generalParametersId")
    private GeneralParametersEntity generalParameters;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publicAreaSiteManagerId")
    private PublicAreaSiteManagerEntity publicAreaSiteManager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roomTypeManagerId")
    private RoomTypeManagerEntity roomTypeManager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "leavesManagerId")
    private LeavesManagerEntity leavesManager;

}
