package com.neoteric.HotelManningMahiDev.hotelGobalData.security.service;


import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.hotelGobalData.security.dto.SecurityDto;
import com.neoteric.HotelManningMahiDev.hotelGobalData.security.enity.SecurityEntity;
import com.neoteric.HotelManningMahiDev.hotelGobalData.security.repository.SecurityRepository;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

private final SecurityRepository securityRepository;
    private final ModelMapper modelMapper;
public SecurityService(SecurityRepository securityRepository,ModelMapper modelMapper){
    this.securityRepository =securityRepository;
    this.modelMapper=modelMapper;
}


    public ResponseEntity<ErrorResponse> addingSecurity(@Valid SecurityDto securityDto) {
        SecurityEntity securityEntity = modelMapper.map(securityDto, SecurityEntity.class);
        securityRepository.save(securityEntity);
    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
