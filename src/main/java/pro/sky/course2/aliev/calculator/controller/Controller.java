package pro.sky.course2.aliev.calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.aliev.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @RequestMapping
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента должны быть переданы! Попробуйте ещё раз.";
        }
        return calculatorService.plus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента должны быть переданы! Попробуйте ещё раз.";
        }
        return calculatorService.minus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента должны быть переданы! Попробуйте ещё раз.";
        }
        return calculatorService.multiply(num1, num2);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента должны быть переданы! Попробуйте ещё раз.";
        }
        return calculatorService.divide(num1, num2);
    }
}
