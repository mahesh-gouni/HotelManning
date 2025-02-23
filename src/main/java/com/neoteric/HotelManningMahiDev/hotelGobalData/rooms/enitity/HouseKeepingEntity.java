package com.neoteric.HotelManningMahiDev.hotelGobalData.rooms.enitity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "houseKeeping")
public class HouseKeepingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "houseKeepingId")
    private Long houseKeepingId;
    @Column(name = "numberOfRooms")
    private int numberOfBays;
    @Column(name = "numberGuestFloors")
    private  int numberGuestFloors;
    @Column(name = "turnDownService")
    private String turnDownService;
    @Column(name = "numberBaysPerRoomAttendant")
    private int numberBaysPerRoomAttendant;
    @Column(name = "publicAreaSpace")
    private String publicAreaSpace;
    @OneToOne(mappedBy = "houseKeeping")
    private RoomsEntity rooms;
}
