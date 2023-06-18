package com.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MonkeyIterator implements Iterator<Monkey> {

    private final List<Monkey> array;
    private int index;


    public MonkeyIterator(Jungle jungle) {
        this.index = 0;

        array = new ArrayList<>(jungle.size());
        while (!jungle.isEmpty()) {
            array.add(jungle.catchMonkey());
        }

    }

    @Override
    public boolean hasNext() {
        return index < array.size();
    }

    @Override
    public Monkey next() {
        return array.get(index++);
    }

}
