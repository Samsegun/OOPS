package com.advanced.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericList<T> implements Iterable<T> {
    private ArrayList<T> items = new ArrayList<>();
    private int count;

    public void add(T item) {
//        items[count++] = item;
        items.add(item);
    }

    public void showCollections() {
        List<Integer> values = new ArrayList<>();

        values.add(2);
        values.add(9);
        values.add(4);
        values.add(40);
        values.add(34);

        System.out.println(values.size());

        Collections.sort(values);

        for (Number value : values) System.out.println(value);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
