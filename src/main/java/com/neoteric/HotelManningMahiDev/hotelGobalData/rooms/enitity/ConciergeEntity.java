package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "concierge")
public class ConciergeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "conciergeId")
    private Long conciergeId;
    @Column(name = "averageDailyPickUpPerDropRequirement")
    private Double averageDailyPickUpPerDropRequirement;
    @Column(name = "averageDailyPickUpPerDropNumbers")
    private Double averageDailyPickUpPerDropNumbers;
    @OneToOne(mappedBy = "concierge")
    private RoomsEntity rooms;
}
