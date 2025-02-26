package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "spaOrFitnessAndRecreation")
public class SpaOrFitnessAndRecreationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spaOrFitnessAndRecreationId")
    private Long spaOrFitnessAndRecreationId;
    @Column(name = "numberOfTreatmentRooms")
    private int numberOfTreatmentRooms;
    @Column(name = "numberOfTreatmentPerRoomsPerDay")
    private int numberOfTreatmentPerRoomsPerDay;
    @Column(name = "numberOfProjectedDailyTreatments")
    private int numberOfProjectedDailyTreatments;
    @Column(name = "numberOfGyms")
    private int numberOfGyms;
    @Column(name = "numberShitsPerGym")
    private int numberShitsPerGym;
    @Column(name = "estimatedPercentageOfInHouseGuestsAtThePool")
    private String estimatedPercentageOfInHouseGuestsAtThePool;
    @Column(name = "estimatedVolumeOfInHouseGuestsAtThePool")
    private String estimatedVolumeOfInHouseGuestsAtThePool;
//    @OneToOne(mappedBy = "spaOrFitnessAndRecreation")
//    private RoomsEntity rooms;
}
