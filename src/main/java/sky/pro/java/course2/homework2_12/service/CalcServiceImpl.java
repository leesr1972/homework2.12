package sky.pro.java.course2.homework2_12.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String getSum(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        int sum = num1.get() + num2.get();
        return num1.get() + " + " + num2.get() + " = " + sum;
    }

    @Override
    public String getDifference(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        int dif = num1.get() - num2.get();
        return num1.get() + " - " + num2.get() + " = " + dif;
    }

    @Override
    public String getComposition(Optional<Integer> num1, Optional<Integer> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        int mult = num1.get() * num2.get();
        return num1.get() + " * " + num2.get() + " = " + mult;
    }

    @Override
    public String getDivision(Optional<Float> num1, Optional<Float> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        float div = num1.get() / num2.get();
        return num1.get() + " / " + num2.get() + " = " + div;
    }
}
