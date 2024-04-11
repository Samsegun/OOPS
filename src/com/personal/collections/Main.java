package com.personal.collections;

public class Main {
    public static void main(String[] args) {
        Iterators<Integer> list = new Iterators<>();

        list.add(1);
        list.add(2);
        list.add(12);
        list.add(4);
        list.add(20);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getItemAtIndex(i));
        }
    }
}
