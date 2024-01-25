package com.moshoop;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee();
        var employee2 = new Employee(50_000, 30);

        System.out.println(employee2.calculateWage(10));
        Employee.printNumberOfEmployees();
    }
}
