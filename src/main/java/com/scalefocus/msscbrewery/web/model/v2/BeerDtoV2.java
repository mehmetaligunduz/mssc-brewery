package com.scalefocus.msscbrewery.web.model.v2;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID id;

    private String name;

    private BeerStyleEnum beerStyle;

    private Long upc;

}
