package sky.pro.java.course2.homework2_12.service;

import java.util.Optional;

public interface CalcService {
    String getSum(Optional<Integer> num1, Optional<Integer> num2);
    String getDifference(Optional<Integer> num1, Optional<Integer> num2);
    String getComposition(Optional<Integer> num1, Optional<Integer> num2);
    String getDivision(Optional<Float> num1, Optional<Float> num2);
}
