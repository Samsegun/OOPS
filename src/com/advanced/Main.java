package com.advanced;

import com.advanced.generics.GenericList;

public class Main {
    public static void main(String[] args) {

        var genericList = new GenericList<Integer>();
        genericList.add(1);
        genericList.add(10);
        genericList.add(27);
        genericList.add(47);

        for (Integer integer : genericList) System.out.println(integer);
    }
}
