package org.example.exception;

public class InvalidCalculatorInputException extends RuntimeException {
    public InvalidCalculatorInputException() {
        super("Invalid parameter(s) was(/were) given. Exiting calculator program.");
    }
}
