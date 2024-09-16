package fr.ktourret.service;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a , double b) {
        return (a * 10 - b * 10) / 10;
    }

    public double multiply(double a , double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exception {
        if (b == 0) throw new Exception("ON NE DIVISE PAR ZERO !!!!");
        return a / b;
    }

}
