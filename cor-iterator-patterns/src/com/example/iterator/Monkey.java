package com.example.iterator;

public class Monkey {

    private final String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void scream() {
        System.out.println("Monkey says: My name is " + name);
    }

}
