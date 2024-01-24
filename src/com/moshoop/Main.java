package com.moshoop;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee();
        employee1.setBaseSalary(10_000);
        employee1.setHourlyRate(20);
        System.out.println(employee1.getBaseSalary());
        System.out.println(employee1.getHourlyRate());

    }
}
