package com.example.cor;

import java.util.Map;

public class BakeryHandler extends AbstractGlovoHandler {

    public BakeryHandler(Map<String, Double> itemPrices) {
        super(itemPrices);
    }


    @Override
    public void handle(Order order) {

        if ("Bakery".equals(order.getRestaurant())) {

            System.out.println("Cafe Degusto is serving the client");

            double price = order.getOrders().entrySet()
                    .stream()
                    .mapToDouble(i -> itemPrices.get(i.getKey())*i.getValue())
                    .sum();

            double serviceFee = price*0.1;
            double totalPrice = price + serviceFee;
            System.out.println("Total price: " + totalPrice);
        }

        super.handle(order);
    }

}
