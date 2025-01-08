package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {
    private String korName;

    @Pattern(regexp = "^[a-zA-z]+ ?[a-zA-z]+$")
    private String engName;
//* => 0번 이상
//+ => 1번 이상
//? => 0 Or 1

    @Range(min = 100, max = 50000)
// int타입은 @Pattern사용 불가
//    @Pattern(regexp = "^[0-9]{100,50000}+$")
    private int price;
}
//Cafe Latte
//CafeLatte