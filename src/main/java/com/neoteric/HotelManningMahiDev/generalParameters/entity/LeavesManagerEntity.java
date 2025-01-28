package com.neoteric.HotelManningMahiDev.generalParameters.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "leave_manager")
public class LeavesManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leavesManagerId")
    private Long id;

    @OneToMany(mappedBy ="leavesManager", cascade = CascadeType.ALL)
    private List<LeaveEntity> leaves = new ArrayList<>();
    @Column(name = "total")
    private String total;
    @Column(name = "relieverFactor")
    private String relieverFactor;

    @OneToOne(mappedBy = "leavesManager")
    private GeneralParaTotalEntity generalParaTotal;
}
