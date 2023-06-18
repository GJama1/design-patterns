package com.example.decorator;

public class DiamondSword extends SwordDecorator {

    public DiamondSword(Sword sword) {
        super(sword);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Deal 3 bonus damage");
    }

}
