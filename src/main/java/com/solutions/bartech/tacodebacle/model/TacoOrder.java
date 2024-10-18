package com.solutions.bartech.tacodebacle.model;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private List<Taco> tacos = new ArrayList<>();
    private String ccCVV;

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}