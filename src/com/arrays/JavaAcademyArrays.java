package com.arrays;

import java.util.Arrays;

public class JavaAcademyArrays {
    public static void main(String[] args) {
        String[] chars = {"january", "february", "march", "april"};
        String[] pisces = new String[2];

        System.arraycopy(chars, 1, pisces, 0, pisces.length);
        System.out.println(Arrays.toString(pisces));
    }
}
