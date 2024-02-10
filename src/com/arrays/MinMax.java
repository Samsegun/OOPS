package com.arrays;

public class MinMax {
    public static void main(String[] args) {
//        int[] numbers = {1,3,5,1,400,7,-2,85,9,10};
        int[] numbers = {2,4,6,-3,5};
        int[] results = findMinMax(numbers);

        System.out.println("Min = " + results[0] + ", Max = " + results[1]);
    }

    public static int[] findMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[] {min, max};
    }
}
