package org.example.exception;

public class InvalidCalculatorTypeException extends RuntimeException {
    public InvalidCalculatorTypeException() {
        super("The given operation is not possible with the chosen calculator type. Exiting calculator program.");
    }
}
