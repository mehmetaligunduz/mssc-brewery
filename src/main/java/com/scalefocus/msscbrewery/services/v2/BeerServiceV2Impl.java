package com.scalefocus.msscbrewery.services.v2;

import com.scalefocus.msscbrewery.web.model.BeerDto;
import com.scalefocus.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBearById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

        log.info("Updating beer with id {}", beerId);

    }

    @Override
    public void deleteBeer(UUID beerId) {

        log.info("Deleting beer with id {}", beerId);
        
    }
}
