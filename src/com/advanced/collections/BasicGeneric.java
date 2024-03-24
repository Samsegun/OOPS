package com.advanced.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicGeneric<T> implements Iterable<T> {
    private ArrayList<T> items = new ArrayList<T>();
    private int count;

    public void add(T item) {
//        items[count++] = item;
        if(item != null) {
            items.add(item);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}