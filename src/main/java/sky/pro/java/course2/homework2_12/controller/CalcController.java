package sky.pro.java.course2.homework2_12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.homework2_12.service.CalcService;

import java.util.Optional;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String calcGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2) {
        return calcService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        return calcService.getDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String showComposition(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2) {
        return calcService.getComposition(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivision (@RequestParam Optional<Float> num1, @RequestParam Optional<Float> num2) {
        return calcService.getDivision(num1, num2);
    }
}
