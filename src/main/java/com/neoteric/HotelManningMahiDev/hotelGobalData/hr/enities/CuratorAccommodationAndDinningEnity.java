package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.enities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CuratorAccommodationAndDinning")
public class CuratorAccommodationAndDinningEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CuratorAccommodationAndDinningId;
    @Column(name = "numberOfAccommodationFacilities")
    private int numberOfAccommodationFacilities;
    @Column(name = "numberOfShiftsInFacilities")
    private int numberOfShiftsInFacilities;
    @Column(name = "totalNumberOfProjectedCoversPerDay")
    private int totalNumberOfProjectedCoversPerDay;
}
