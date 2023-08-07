package taller.ejercicio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import taller.ejercicio.model.Calculator;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(Calculator calculator, Model model) {
        double result = 0;

        switch (calculator.getOperation()) {
            case "suma":
                result = calculator.getNum1() + calculator.getNum2();
                break;
            case "resta":
                result = calculator.getNum1() - calculator.getNum2();
                break;
            case "mult":
                result = calculator.getNum1() * calculator.getNum2();
                break;
            case "division":
                result = calculator.getNum1() / calculator.getNum2();
                break;
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}