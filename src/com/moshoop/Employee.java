package com.moshoop;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numOfEmployees;

    public Employee() {
        this(10_000, 20);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

        numOfEmployees++;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    public static void printNumberOfEmployees() {
        System.out.println("Number of employees: " + numOfEmployees);
    }
}
