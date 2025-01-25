package com.neoteric.HotelManningMahiDev.utilites;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapConfigClass {
    @Bean

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
