package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;
    private String korName;

    @Pattern(regexp = "^[a-zA-z]+ ?[a-zA-z]+$")
    private String engName;

    @Range(min = 100, max = 50000)
    private int price;
}
