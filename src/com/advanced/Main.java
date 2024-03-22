package com.advanced;

import com.advanced.collections.BasicGeneric;

public class Main {
    public static void main(String[] args) {

        BasicGeneric<Integer> genericList = new BasicGeneric<>();
        genericList.add(1);
        genericList.add(10);
        genericList.add(27);
        genericList.add(47);

        try {
            for (Integer integer : genericList) System.out.println(integer);
        } catch (NullPointerException e) {
            System.out.println("object does not implement Iterable interface");
        }

        System.out.println("logging out...");
    }
}
