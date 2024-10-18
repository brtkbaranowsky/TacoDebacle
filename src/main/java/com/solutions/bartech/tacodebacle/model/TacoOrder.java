package com.solutions.bartech.tacodebacle.model;

import java.util.List;

public record TacoOrder(
        String deliveryName,
        String deliveryStreet,
        String deliveryCity,
        String deliveryState,
        String deliveryZip,
        String ccNumber,
        String ccExpiration,
        String ccCVV,
        List<Taco> tacos
) {
    public TacoOrder {
        tacos = (tacos != null) ? List.copyOf(tacos) : List.of();
    }
}
