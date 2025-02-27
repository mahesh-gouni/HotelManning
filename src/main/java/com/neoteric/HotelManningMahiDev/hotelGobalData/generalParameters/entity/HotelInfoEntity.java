package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotel_info")
public class HotelInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelInfoId")
    private Long id;
    @Column(name = "hotelName")
    private String hotelName;
    @Column(name = "isItFiveStar")
    private boolean isItFiveStar;
    @Column(name = "isItStandaloneHotel")
    private boolean isItStandaloneHotel;
    @Column(name = "headCountForIBU")
    private int headCountForIBU;
    @Column(name = "headCountForFBUInCluster")
    private int headCountForFBUInCluster;
    @Column(name = "ProjectedEmpHeadCount")
    private int ProjectedEmpHeadCount;
//    @OneToOne(mappedBy = "hotelInfo")
//    private GeneralParaTotalEntity generalParaTotal;
}
