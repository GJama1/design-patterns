package com.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Jungle implements Iterable<Monkey> {

    private List<Monkey> monkeys = new ArrayList<>();

    public int size() {
        return monkeys.size();
    }

    public boolean isEmpty() {
        return monkeys.isEmpty();
    }

    @Override
    public Iterator<Monkey> iterator() {
        return new MonkeyIterator(this);
    }

    public void addMonkey(Monkey monkey) {
        monkeys.add(monkey);
    }

    public Monkey catchMonkey() {

        Random rand = new Random();

        int index = rand.nextInt(monkeys.size());
        Monkey monkey = monkeys.get(index);
        monkeys.remove(index);

        return monkey;
    }

}
