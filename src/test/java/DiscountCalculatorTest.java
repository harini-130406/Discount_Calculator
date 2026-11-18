package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    DiscountCalculator calculator = new DiscountCalculator();

    @Test
    public void testBelow1000() {
        assertEquals(900.0, calculator.calculateFinalAmount(900), 0.001);
    }

    @Test
    public void testEqualTo1000() {
        assertEquals(900.0, calculator.calculateFinalAmount(1000), 0.001);
    }

    @Test
    public void testAbove1000() {
        assertEquals(1350.0, calculator.calculateFinalAmount(1500), 0.001);
    }
}