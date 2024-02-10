package com.arrays;

import java.util.Scanner;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,3,4};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target number: ");
        int target = scanner.nextInt();

        printNoOfOccurrence(target, numbers);

    }

    public static void printNoOfOccurrence(int target, int[] numbers) {
        int occurrence = 0;

        for(int number: numbers) {
            if(number == target)
                occurrence++;
        }

        System.out.println(target + " occurs " + occurrence + (occurrence > 1 ? " times" : " time"));
    }
}
