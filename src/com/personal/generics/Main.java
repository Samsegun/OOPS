package com.personal.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(4);
        System.out.println(intBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("samuel");
        System.out.println(stringBox.getItem());

        String maxInt = Utils.max("apples","applet");
        System.out.println(maxInt);

        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        System.out.println("displaying the sum= "+add(l1));

    }

    private static double add(ArrayList<? extends Number> num) {
        double sum=0.0;

        for(Number n:num)
        {
            sum = sum+n.doubleValue();
        }

        return sum;
    }
//    private static Double add2(ArrayList<? super Integer> num) {
//
//        double sum=0.0;
//
//        for(Number n:num)
//        {
//            sum = sum+n.doubleValue();
//        }
//
//        return sum;
//    }
}
