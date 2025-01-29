package com.neoteric.HotelManningMahiDev.utilites;

import com.neoteric.HotelManningMahiDev.generalParameters.dto.Product;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigClass {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("Hotel Manning Mahi Dev API")
                .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                .contact(new Contact().name("Manning"))
                .version("v0.0.1"));
    }


//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    @Bean
    public WebClient.Builder webClient() {
        return WebClient
                .builder();
    }

}