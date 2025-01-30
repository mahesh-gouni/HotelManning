package com.neoteric.HotelManningMahiDev.customValidation.usingTwofields;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public OfferDto createOffer(OfferDto offerDto) {
        OfferEntity offer = modelMapper.map(offerDto, OfferEntity.class);
        OfferEntity savedOffer = offerRepository.save(offer);
        return modelMapper.map(savedOffer, OfferDto.class);
    }
}