package taller.ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {

    @Test
    public void testAddition() {
        double num1 = 5;
        double num2 = 3;
        double expected = 8;
        double result = num1 + num2;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        double num1 = 5;
        double num2 = 3;
        double expected = 2;
        double result = num1 - num2;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        double num1 = 5;
        double num2 = 3;
        double expected = 15;
        double result = num1 * num2;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        double num1 = 6;
        double num2 = 3;
        double expected = 2;
        double result = num1 / num2;
        Assertions.assertEquals(expected, result);
    }
}