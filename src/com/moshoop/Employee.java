package com.moshoop;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
