package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "leave_entity")
@Data
public class LeaveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="leaveType" )
    private String leaveType;
    @Column(name = "leaveCount")
    private int leaveCount;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "leavesManagerId")
    private LeavesManagerEntity leavesManager;

}
