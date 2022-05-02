package sky.pro.java.course2.homework2_12.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static sky.pro.java.course2.homework2_12.constants.CalcServiceTestConstants.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceImplParameterizedTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    public static Stream<Arguments> argumentsForGetSum() {
        return Stream.of(
                Arguments.of("4 + 5 = 9", Optional.of(4), Optional.of(5)),
                Arguments.of("20 + 60 = 80", Optional.of(20), Optional.of(60)),
                Arguments.of(("1 + 1 = 2"), Optional.of(1), Optional.of(1))
        );
    }

    public static Stream<Arguments> argumentsForGetDifference() {
        return Stream.of(
                Arguments.of("40 - 10 = 30", Optional.of(40), Optional.of(10)),
                Arguments.of("6 - 2 = 4", Optional.of(6), Optional.of(2)),
                Arguments.of(("1 - 1 = 0"), Optional.of(1), Optional.of(1))
        );
    }

    public static Stream<Arguments> argumentsForGetComposition() {
        return Stream.of(
                Arguments.of("4 * 5 = 20", Optional.of(4), Optional.of(5)),
                Arguments.of("20 * 4 = 80", Optional.of(20), Optional.of(4)),
                Arguments.of(("1 * 1 = 1"), Optional.of(1), Optional.of(1))
        );
    }

    public static Stream<Arguments> argumentsForGetDivision() {
        return Stream.of(
                Arguments.of("4.0 / 2.0 = 2.0", Optional.of(4f), Optional.of(2f)),
                Arguments.of("20.0 / 5.0 = 4.0", Optional.of(20f), Optional.of(5f)),
                Arguments.of(("1.0 / 1.0 = 1.0"), Optional.of(1f), Optional.of(1f))
        );
    }

    @Test
    public void getSumTest() {
        assertEquals(NOT_NUM2, out.getSum(Optional.of(3), Optional.empty()));
    }

    @ParameterizedTest
    @MethodSource("argumentsForGetSum")
    public void getSumParameterizedTest(String rezult, Optional<Integer> num1, Optional<Integer> num2) {
        assertEquals(rezult, out.getSum(num1, num2));
    }

    @Test
    public void getDifferenceTest() {
        assertEquals(NOT_NUM1, out.getDifference(Optional.empty(), Optional.of(5)));
    }

    @ParameterizedTest
    @MethodSource("argumentsForGetDifference")
    public void getDifferenceParameterizedTest(String rezult, Optional<Integer> num1, Optional<Integer> num2) {
        assertEquals(rezult, out.getDifference(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argumentsForGetComposition")
    public void getCompositionParameterizedTest(String rezult, Optional<Integer> num1, Optional<Integer> num2) {
        assertEquals(rezult, out.getComposition(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argumentsForGetDivision")
    public void getDivisionParameterizedTest(String rezult, Optional<Float> num1, Optional<Float> num2) {
        assertEquals(rezult, out.getDivision(num1, num2));
    }
}