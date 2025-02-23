package com.neoteric.HotelManningMahiDev.utilites;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigClass {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI().info(new Info().title("Hotel Manning Mahi Dev API")
//                .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
//                .contact(new Contact().name("Manning"))
//                .version("v0.0.1"));
//    }






}