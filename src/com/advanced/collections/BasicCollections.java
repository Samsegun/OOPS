package com.advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicCollections {

    public static void example() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(23);
        numbers.add(74);
        numbers.add(14);



//        for(Integer num: numbers) {
//            System.out.println(num);
//        }
        System.out.println(numbers);
        System.out.println(numbers.get(2));
    }

    public static void main(String[] args) {
        example();
    }

}
