package sky.pro.java.course2.homework2_12.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceImplTest {

    private final CalcServiceImpl out = new CalcServiceImpl();
    private String notNum1;
    private String notNum2;

    @BeforeEach
    public void setUp() {
        notNum1 = "Ошибка! Вы не ввели параметр num1.";
        notNum2 = "Ошибка! Вы не ввели параметр num2.";
    }

    @Test
    public void getSumTest() {
        String sum2And4 = "2 + 4 = 6";
        assertEquals(sum2And4, out.getSum(Optional.of(2), Optional.of(4)));
        assertEquals(notNum2, out.getSum(Optional.of(3), Optional.empty()));
    }

    @Test
    public void getDifferenceTest() {
        String dif8And3 = "8 - 3 = 5";
        assertEquals(dif8And3, out.getDifference(Optional.of(8), Optional.of(3)));
        assertEquals(notNum1, out.getDifference(Optional.empty(), Optional.of(5)));
    }

    @Test
    public void getCompositionTest() {
        String mult12And5 = "12 * 5 = 60";
        assertEquals(mult12And5, out.getComposition(Optional.of(12), Optional.of(5)));
        assertEquals(notNum2, out.getComposition(Optional.of(10), Optional.empty()));
    }

    @Test
    public void getDivisionTest() {
        String div45And9 = "45.0 / 9.0 = 5.0";
        assertEquals(div45And9, out.getDivision(Optional.of(45f), Optional.of(9f)));
        assertEquals(notNum1, out.getDivision((Optional.empty()), Optional.of(7f)));
        assertThrows(IllegalArgumentException.class, () -> out.getDivision(Optional.of(100f), Optional.of(0f)));
    }
}