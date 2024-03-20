package com.personal.exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/2;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
    }

}
