//package com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.service;
//
//
//
//import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
//import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.dto.GeneralParameters;
////import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.entity.GeneralParametersEntity;
////import com.neoteric.HotelManningMahiDev.hotelGobalData.generalParameters.repository.GeneralParametersRepo;
//import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.client.reactive.ReactorClientHttpConnector;
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.netty.http.client.HttpClient;
//
//@Service
//public class GeneralParametersService {
//    private MapperPointer mapper;
//    private GeneralParametersRepo generalParametersRepo;
//    public GeneralParametersService(GeneralParametersRepo generalParametersRepo, MapperPointer mapper){
//        this.generalParametersRepo=generalParametersRepo;
//        this.mapper=mapper;
//    }
//
//    public ResponseEntity<ErrorResponse> addGeneralParameters(GeneralParameters generalParameters) {
//        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParameters));
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
//
////    public ResponseEntity<MicroResponse> geetingGeneralParameters(Long id) {
////        MicroResponse microResponse = new MicroResponse();
////
////        GeneralParametersEntity generalParameters = generalParametersRepo.findById(id)
////                .orElseThrow(() -> new RuntimeException("GeneralParameters not found for id: " + id));
////GeneralParameters generalParameters1 = mapper.convertToDtoGeneralParameters(generalParameters);
////
////     //   RestTemplate restTemplate = new RestTemplate();
////        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
////
////        ResponseEntity<Product> responseEntity = restTemplate
////                .getForEntity("http://localhost:8080/product/product/" + generalParameters.getId(),
////                        Product.class);
////        System.out.println("Redirect Location: " + responseEntity.getHeaders().getLocation());
////        Product someExternalDto = responseEntity.getBody();
////
////        System.out.println(responseEntity.getStatusCode());
////
////        microResponse.setGeneralParameters(generalParameters1);
////        microResponse.setProduct(someExternalDto);
////
////        return ResponseEntity.ok(microResponse);
////    }
//
//
//
//
//}
