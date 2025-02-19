package com.neoteric.HotelManningMahiDev.hotelGobalData.hr.service;


import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.dto.CuratorAccommodationAndDinning;
import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.enities.CuratorAccommodationAndDinningEnity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.hr.repository.CuratorAccommodationAndDinningRepository;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CuratorAccommodationAndDinningService {
    private final CuratorAccommodationAndDinningRepository curatorAccommodationAndDinningRepository;
    private final ModelMapper mapper;
    public CuratorAccommodationAndDinningService(CuratorAccommodationAndDinningRepository curatorAccommodationAndDinningRepository, ModelMapper mapper){
        this.curatorAccommodationAndDinningRepository=curatorAccommodationAndDinningRepository;
        this.mapper=mapper;
    }
    public ResponseEntity<ErrorResponse> addingCurator(@Valid CuratorAccommodationAndDinning curatorAccommodationAndDinning) {
        CuratorAccommodationAndDinningEnity accommodationAndDinningEnity = mapper.map(curatorAccommodationAndDinning,CuratorAccommodationAndDinningEnity.class);
        curatorAccommodationAndDinningRepository.save(accommodationAndDinningEnity);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
