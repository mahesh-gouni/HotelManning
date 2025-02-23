package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "laundry")
public class LaundryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "laundryId")
    private Long laundryId;
    @Column(name = "averageDailyLaundryUsage")
    private Double averageDailyLaundryUsage;
    @Column(name = "averageDailyLaundry")
    private Double averageDailyLaundry;
    @OneToOne(mappedBy = "laundry")
    private RoomsEntity rooms;
}
