package com.scalefocus.msscbrewery.services;

import com.scalefocus.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBearById(UUID beerId) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Bud")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beer with id {}", beerId);
    }

}
