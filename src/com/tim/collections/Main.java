package com.tim.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String[] names = {"sam", "bob", "tommy", "smith"};
        list.addAll(Arrays.asList(names));
        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary"));
        System.out.println(list);

        list.removeIf(s -> s.toLowerCase().charAt(0) == 'g');
        System.out.println(list);
        System.out.println("list contains George? " + list.contains("George"));
    }
}
