package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_positiveNumbers_success() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        Assertions.assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testAdd_negativeNumbers_success() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-2, -3);

        Assertions.assertEquals(-5, result, "-2 + -3 should equal -5");
    }

    @Test
    public void testAdd_zero_success() {
        Calculator calculator = new Calculator();

        int result = calculator.add(0, 0);

        Assertions.assertEquals(0, result, "0 + 0 should equal 0");
    }
}