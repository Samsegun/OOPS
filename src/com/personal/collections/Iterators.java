package com.personal.collections;

import java.util.Iterator;

public class Iterators<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public Iterators() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }
    public T getItemAtIndex(int index) {
        return items[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

//    private class ListIterators implements Iterator<T> {
//
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public T next() {
//            return null;
//        }
//    }
}
