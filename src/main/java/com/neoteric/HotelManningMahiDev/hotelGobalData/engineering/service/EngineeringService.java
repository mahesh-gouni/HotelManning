package com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.service;

import com.neoteric.HotelManningMahiDev.aop.TrackExecutionTime;
import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.dto.EngineeringDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.entity.EngineeringEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.engineering.repository.EngineeringRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EngineeringService {

    private final EngineeringRepository engineeringRepositroy;

    private final ModelMapper modelMapper;

    @Transactional
    @TrackExecutionTime
    public ResponseEntity<ErrorResponse> addingRoom(@Valid EngineeringDto engineering) {
        EngineeringEntity engineeringEntity =  modelMapper.map(engineering, EngineeringEntity.class);

        engineeringRepositroy.save(engineeringEntity);
    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
