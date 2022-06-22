package com.example.imperial_api;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ImperialController {

    private Imperial imperial = new Imperial();

    @RequestMapping("/ounceToGram")
    public double ounceToGram(
            @RequestParam double a
    ){
        return imperial.ounceToGram(a);
    }

    @RequestMapping("/stoneToKilogram")
    public double stoneToKilogram(
            @RequestParam double a
    ){
        return imperial.ounceToGram(a);
    }


}
