package com.example.cor;

import java.util.Map;

public class Order {

    private String restaurant;
    private Map<String, Integer> orders;

    public Order(String restaurant, Map<String, Integer> orders) {
        this.restaurant = restaurant;
        this.orders = orders;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Map<String, Integer> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Integer> orders) {
        this.orders = orders;
    }

}
