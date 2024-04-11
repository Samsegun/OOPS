package com.advanced.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicGeneric<T> implements Iterable<T> {
    private List<T> items = new ArrayList<T>();
    private int count;

    public void add(T item) {
        if(item != null) {
            items.add(item);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}