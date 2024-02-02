package com.interfaces;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void printTax() {
        System.out.println("Your tax is " + calculator.calculateTax());
    }
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
