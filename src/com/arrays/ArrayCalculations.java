package com.arrays;

public class ArrayCalculations {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,5,7};

        System.out.println("Sum of array: " + sumOfArray(numbers));
        System.out.println("Product of array: " + productOfArray(numbers));
        System.out.println("Average of array: " + averageOfArray(numbers));
    }

    public static int sumOfArray(int[] numbers) {
        int sum = 0;
        for(int number: numbers)
            sum += number;

        return sum;
    }
    public static int productOfArray(int[] numbers) {
        int product = 1;
        for(int number: numbers)
            product *= number;

        return product;
    }
    public static double averageOfArray(int[] numbers) {
        int sum = sumOfArray(numbers);

        return (double) sum / numbers.length;
    }
}
