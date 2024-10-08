package com.scalefocus.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private String name;

    private String beerStyle;

    private Long upc;
    
}
