package com.moshoop;

public class TaxReport {
    private final TaxCalculator taxCalculator;

    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void printTax() {
        System.out.println("Your tax is " + taxCalculator.calculateTax());
    }
}
