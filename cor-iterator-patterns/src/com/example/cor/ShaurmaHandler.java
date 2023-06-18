package com.example.cor;

import java.util.Map;

public class ShaurmaHandler extends AbstractGlovoHandler {

    public ShaurmaHandler(Map<String, Double> itemPrices) {
        super(itemPrices);
    }


    @Override
    public void handle(Order order) {

        if ("Shaurma".equals(order.getRestaurant())) {

            System.out.println("Marge's Shaurma is serving the client");

            double totalPrice = order.getOrders().entrySet()
                    .stream()
                    .mapToDouble(i -> itemPrices.get(i.getKey())*i.getValue())
                    .sum();

            System.out.println("Total price: " + totalPrice);
        }

        super.handle(order);
    }


}
