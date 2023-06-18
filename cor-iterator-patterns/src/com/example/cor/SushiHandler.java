package com.example.cor;

import java.util.Map;

public class SushiHandler extends AbstractGlovoHandler {

    public SushiHandler(Map<String, Double> itemPrices) {
        super(itemPrices);
    }

    @Override
    public void handle(Order order) {

        if ("Sushi".equals(order.getRestaurant())) {

            System.out.println("Japan2Georgia is serving the client");

            double price = order.getOrders().entrySet()
                    .stream()
                    .mapToDouble(i -> itemPrices.get(i.getKey())*i.getValue())
                    .sum();

            double deliveryCost = 5.0;
            double totalPrice = price + deliveryCost;
            System.out.println("Total price: " + totalPrice);
        }

        super.handle(order);
    }
}
