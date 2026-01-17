package com.example.week1.alicenbackery;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "syrup.type", havingValue = "chocolate")
@Qualifier("chocolate")
public class ChocolateSyrup implements Syrup{

    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
