package com.personal.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static <T> void printArray(T[] inputArray) {
        for(T element: inputArray) System.out.printf("%s ", element);
    }

    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray(integerArray);

        System.out.println( "\nArray doubleArray contains:" );
        printArray(doubleArray);

        System.out.println( "\nArray characterArray contains:" );
        printArray(characterArray);
    }
}
