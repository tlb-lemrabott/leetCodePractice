package org.example.arrays;

public class RationalNumber {
    private int numerator;
    private int denominator;
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplifyTheFraction();
    }
    private void simplifyTheFraction() {
        int gcd = getTheGcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }
    private int getTheGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void printInFractionForm() {
        System.out.println(numerator + "/" + denominator);
    }
    public void printInDecimalForm() {
        System.out.println((double) numerator / denominator);
    }
    public RationalNumber addRational(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
    public RationalNumber subtractRational(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
    public RationalNumber multiplyRational(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
    public RationalNumber divideRational(RationalNumber other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}