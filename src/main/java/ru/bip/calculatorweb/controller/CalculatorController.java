package ru.bip.calculatorweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bip.calculatorweb.service.CalculatorService;

import java.util.Optional;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private  final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Optional<Integer> num1, @RequestParam("num2") Optional<Integer> num2) throws Exception {
        return service.plus(num1,num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Optional<Integer> num1, @RequestParam("num2") Optional<Integer> num2) {
        return service.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Optional<Integer> num1, @RequestParam("num2") Optional<Integer> num2) {
        return service.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Optional<Integer> num1, @RequestParam("num2") Optional<Integer> num2) {
        return service.divide(num1,num2);
    }
}
