package com.advanced.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicCollections {

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(23);
        numbers.add(74);
        numbers.add(14);

        numbers.set(1, 230);

        Iterator<Integer> itr = numbers.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
