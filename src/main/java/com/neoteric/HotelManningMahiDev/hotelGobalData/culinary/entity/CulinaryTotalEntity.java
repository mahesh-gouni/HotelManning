package com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.entity;

import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto.CulinaryDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto.CuratorDinningDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.culinary.dto.CuratorDinningTwoDto;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "culinaryTotal")
public class CulinaryTotalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long culinaryTotalId;
    @OneToOne
    @JoinColumn(name = "culinaryId")
    private CulinaryEntity culinaryEntity;
    @OneToOne
    @JoinColumn(name = "curatorDinningId")
    private CuratorDinningEntity curatorDinningEntity;
    @OneToOne
    @JoinColumn(name = "curatorDinningTwoId")
    private CuratorDinningTwoEntity curatorDinningTwoEntity;

}
