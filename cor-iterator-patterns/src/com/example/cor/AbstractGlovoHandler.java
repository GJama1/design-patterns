package com.example.cor;

import java.util.Map;

public abstract class AbstractGlovoHandler implements Handler {

    protected Map<String, Double> itemPrices;
    protected Handler next;

    AbstractGlovoHandler(Map<String, Double> itemPrices) {
        this.itemPrices = itemPrices;
    }

    public void addItem(String item, Double price) {
        if (!itemPrices.containsKey(item)) {
            itemPrices.put(item, price);
        }
    }

    public void removeItem(String item) {
        itemPrices.remove(item);
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Order order) {
        if (next != null) {
            next.handle(order);
        }
    }

}
