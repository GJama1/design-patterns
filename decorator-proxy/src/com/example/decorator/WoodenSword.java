package com.example.decorator;

public class WoodenSword implements Sword{

    @Override
    public void attack() {
        System.out.println("Deal 3 damage");
    }

}
