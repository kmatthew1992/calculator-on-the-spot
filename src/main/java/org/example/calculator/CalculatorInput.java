package org.example.calculator;

import org.example.exception.InvalidCalculatorInputException;

public class CalculatorInput {
    int a;
    int b;
    String operator;

    public int getA() {
        return a;
    }

    public void setA(String a) {
        try {
            this.a = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw new InvalidCalculatorInputException();
        }
    }

    public int getB() {
        return b;
    }

    public void setB(String b) {
        try {
            this.b = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            throw new InvalidCalculatorInputException();
        }
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
