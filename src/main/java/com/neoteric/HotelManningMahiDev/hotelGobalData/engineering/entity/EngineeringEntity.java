package com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "engineering")
public class EngineeringEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long engineering_id;
    @Column(name = "TotalNumberOfHotelRooms")
    private int TotalNumberOfHotelRooms;
    @Column(name = "TotalNumberOfMajorKitchenEquipments")
    private int TotalNumberOfMajorKitchenEquipments;
    @Column(name = "NumberOfShifts")
    private int NumberOfShifts;
    @Column(name = "NumberOfTechniciansPerSuperVisor")
    private int NumberOfTechniciansPerSuperVisor;


}
