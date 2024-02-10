package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayLength = getArrayLength();
        int[] numbers = new int[arrayLength];
        fillAndPrintArray(numbers);
    }

    public static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;

        while(true) {
            System.out.print("Enter length of array: ");
            arrayLength = scanner.nextInt();

            if(arrayLength < 1 || arrayLength > 20) {
                System.out.println("Invalid range. Try a different number!");
                continue;
            }

            break;
        }
        return arrayLength;
    }

    public static void fillAndPrintArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
