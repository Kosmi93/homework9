package ru.bip.calculatorweb.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CalculatorService {
    public String plus(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty() || num2.isEmpty())
            return emptyText();
        int result = num1.get() + num2.get();
        return num1.get() + " + " + num2.get() + " = " + result;


    }

    public String minus(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty() || num2.isEmpty())
            return emptyText();
        int result = num1.get() - num2.get();
        return num1.get() + " - " + num2.get() + " = " + result;
    }

    public String multiply(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty() || num2.isEmpty())
            return emptyText();
        int result = num1.get() * num2.get();
        return num1.get() + " * " + num2.get() + " = " + result;
    }

    public String divide(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty() || num2.isEmpty())
            return emptyText();
        else if (num2.get()==0)
            return "Делить на ноль нельзя!";
        int result = num1.get() / num2.get();
        return num1.get() + " / " + num2.get() + " = " + result;
    }

    private String emptyText() {
        return ("Для вычислений нужно ввести два параметра");
    }
}
