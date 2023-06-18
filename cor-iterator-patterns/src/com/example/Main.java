package com.example;

import com.example.cor.*;
import com.example.iterator.Jungle;
import com.example.iterator.Monkey;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Chain of Responsibility
        Handler marge = new ShaurmaHandler(new HashMap<>() {{
            put("Small", 8.0);
            put("Medium", 10.0);
            put("Big", 12.0);
        }});

        Handler cafeDegusto = new BakeryHandler(new HashMap<>() {{
            put("Coffee", 10.0);
            put("Donut", 3.0);
            put("Khachapuri", 5.0);
        }});

        Handler japan2Georgia = new SushiHandler(new HashMap<>() {{
            put("Small set", 20.0);
            put("Medium set", 30.0);
            put("Big set", 40.0);
        }});

        marge.setNext(cafeDegusto);
        cafeDegusto.setNext(japan2Georgia);

        Order order = new Order("Bakery", Map.of("Donut", 2, "Coffee", 1));
        marge.handle(order);

        order = new Order("Shaurma", Map.of("Small", 4, "Big", 1));
        marge.handle(order);

        order = new Order("Sushi", Map.of("Medium set", 1));
        marge.handle(order);


        //Iterator
        Monkey jeff = new Monkey("Jeff");
        Monkey harambe = new Monkey("Harambe");
        Monkey monki = new Monkey("Monki");

        Jungle jungle = new Jungle();
        jungle.addMonkey(jeff);
        jungle.addMonkey(harambe);
        jungle.addMonkey(monki);

        Iterator<Monkey> iterator = jungle.iterator();

        while (iterator.hasNext()) {
            Monkey monkey = iterator.next();
            monkey.scream();
        }

    }

}