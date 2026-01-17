package com.example.week1.alicenbackery;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frosting.type", havingValue = "chocolate")

public class ChocolateFrosting implements Frosting{

    public String getFrostingType(){
        return "Chocolate Frosting";
    }


}
