package com.example.week1.alicenbackery;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "syrup.type", havingValue = "strawberry")
@Qualifier("strawberry")
public class StrawberrySyrup implements Syrup{

    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
