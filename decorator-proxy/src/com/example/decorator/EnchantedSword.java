package com.example.decorator;

public class EnchantedSword extends SwordDecorator {

    public EnchantedSword(Sword sword) {
        super(sword);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Deal 4 fire damage");
    }

}

