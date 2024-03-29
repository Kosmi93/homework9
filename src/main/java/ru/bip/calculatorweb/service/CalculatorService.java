package ru.bip.calculatorweb.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {
    public String plus(Integer num1, Integer num2) {
        int result = num1+num2;
        return num1 + " + " +num2 + " = "+ result;
    }

    public String minus(Integer num1, Integer num2) {
        int result = num1-num2;
        return num1 + " - " +num2 + " = "+ result;
    }

    public String multiply(Integer num1, Integer num2) {
        int result = num1*num2;
        return num1 + " * " + num2 + " = "+ result;
    }

    public String divide(Integer num1, Integer num2) {
        int result = num1/num2;
        return num1 + " / " +num2 + " = "+ result;
    }
}
