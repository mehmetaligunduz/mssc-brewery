package com.scalefocus.msscbrewery.web.controller;

import com.scalefocus.msscbrewery.services.BeerService;
import com.scalefocus.msscbrewery.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Deprecated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/beers")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerService.getBearById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody BeerDto beerDto) {

        BeerDto savedBeer = beerService.saveNewBeer(beerDto);

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
