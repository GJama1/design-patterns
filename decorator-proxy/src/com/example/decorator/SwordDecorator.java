package com.example.decorator;

public abstract class SwordDecorator implements Sword {

    private Sword sword;

    public SwordDecorator(Sword sword) {
        this.sword = sword;
    }

    @Override
    public void attack() {
        sword.attack();
    }

}
