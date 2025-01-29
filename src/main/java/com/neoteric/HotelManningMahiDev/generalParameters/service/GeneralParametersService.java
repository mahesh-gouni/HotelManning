package com.neoteric.HotelManningMahiDev.generalParameters.service;



import com.neoteric.HotelManningMahiDev.exceptions.ErrorResponse;
import com.neoteric.HotelManningMahiDev.exceptions.MicroResponse;
import com.neoteric.HotelManningMahiDev.generalParameters.dto.GeneralParameters;
import com.neoteric.HotelManningMahiDev.generalParameters.dto.Product;
import com.neoteric.HotelManningMahiDev.generalParameters.entity.GeneralParametersEntity;
import com.neoteric.HotelManningMahiDev.generalParameters.repository.GeneralParametersRepo;
import com.neoteric.HotelManningMahiDev.utilites.MapperPointer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Service
public class GeneralParametersService {
    private MapperPointer mapper;
    private GeneralParametersRepo generalParametersRepo;
    public GeneralParametersService(GeneralParametersRepo generalParametersRepo, MapperPointer mapper){
        this.generalParametersRepo=generalParametersRepo;
        this.mapper=mapper;
    }

    public ResponseEntity<ErrorResponse> addGeneralParameters(GeneralParameters generalParameters) {
        generalParametersRepo.save(mapper.convertToEntityGeneralParameters(generalParameters));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

//    public ResponseEntity<MicroResponse> geetingGeneralParameters(Long id) {
//        MicroResponse microResponse = new MicroResponse();
//
//        GeneralParametersEntity generalParameters = generalParametersRepo.findById(id)
//                .orElseThrow(() -> new RuntimeException("GeneralParameters not found for id: " + id));
//GeneralParameters generalParameters1 = mapper.convertToDtoGeneralParameters(generalParameters);
//
//     //   RestTemplate restTemplate = new RestTemplate();
//        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
//
//        ResponseEntity<Product> responseEntity = restTemplate
//                .getForEntity("http://localhost:8080/product/product/" + generalParameters.getId(),
//                        Product.class);
//        System.out.println("Redirect Location: " + responseEntity.getHeaders().getLocation());
//        Product someExternalDto = responseEntity.getBody();
//
//        System.out.println(responseEntity.getStatusCode());
//
//        microResponse.setGeneralParameters(generalParameters1);
//        microResponse.setProduct(someExternalDto);
//
//        return ResponseEntity.ok(microResponse);
//    }
@Autowired
private WebClient.Builder webClientBuilder;

    public ResponseEntity<MicroResponse> geetingGeneralParameters(Long id) {
        MicroResponse microResponse = new MicroResponse();

        // Fetch GeneralParameters from the repository
        GeneralParametersEntity generalParameters = generalParametersRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("GeneralParameters not found for id: " + id));
        GeneralParameters generalParameters1 = mapper.convertToDtoGeneralParameters(generalParameters);

      //   Use WebClient to call external product service
        Product someExternalDto = webClientBuilder.baseUrl("http://localhost:8080")
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create().followRedirect(true)))
                .build()
                .get()

                .uri("/product/product/"+generalParameters.getId() )
                .retrieve()

                .bodyToMono(Product.class)
                .block();
        System.out.println();
        System.out.println("Redirect Location: " + someExternalDto);

       //Block until the result is received

        System.out.println("Product Info: " + someExternalDto);
        microResponse.setGeneralParameters(generalParameters1);
        microResponse.setProduct(someExternalDto);

        return ResponseEntity.ok(microResponse);
    }


}
