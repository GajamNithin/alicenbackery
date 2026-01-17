package com.example.week1.alicenbackery;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, @Qualifier("strawberry") Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }

    public void bakeCake(){
        System.out.println("Baking cake with:");
        System.out.println("- " + frosting.getFrostingType());
        System.out.println("- " + syrup.getSyrupType());
    }
}
