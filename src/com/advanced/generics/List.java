package com.advanced.generics;

public class List {
    private int[] items = new int[10];
    private int count;

//    public List() {
//
//    }

    public void add(int item) {
        items[count++] = item;
    }

    public int getItem(int index) {
        return items[index];
    }
}
