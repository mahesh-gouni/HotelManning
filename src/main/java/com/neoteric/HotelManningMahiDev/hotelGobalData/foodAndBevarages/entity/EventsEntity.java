package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "events")
public class EventsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    @Column(name = "numberOfSegmentsCorporate")
    private int numberOfSegmentsCorporate;
}
