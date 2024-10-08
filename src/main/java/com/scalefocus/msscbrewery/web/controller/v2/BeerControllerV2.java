package com.scalefocus.msscbrewery.web.controller.v2;

import com.scalefocus.msscbrewery.services.v2.BeerServiceV2;
import com.scalefocus.msscbrewery.web.model.BeerDto;
import com.scalefocus.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/beers")
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerService.getBearById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody BeerDto beerDto) {

        BeerDtoV2 savedBeer = beerService.saveNewBeer(beerDto);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Location", "/api/v1/beers/" + savedBeer.getId().toString());

        return new ResponseEntity<>(responseHeaders, HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> handleUpdate(@PathVariable UUID beerId, BeerDto beerDto) {

        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID beerId) {

        beerService.deleteBeer(beerId);

    }

}
