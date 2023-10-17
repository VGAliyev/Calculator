package pro.sky.course2.aliev.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return (num2 != 0) ? String.valueOf((double) num1 / num2) : "На нуль делить нельзя!";
    }
}
