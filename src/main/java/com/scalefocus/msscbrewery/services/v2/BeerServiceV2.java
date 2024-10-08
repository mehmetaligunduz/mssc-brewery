package com.scalefocus.msscbrewery.services.v2;

import com.scalefocus.msscbrewery.web.model.BeerDto;
import com.scalefocus.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBearById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);

}
