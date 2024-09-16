package fr.ktourret.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    // ADDITION

    @Test
    public void testSuccessAddition() {
        assertEquals(4, calculator.addition(2, 2));
    }

    @Test
    public void testSuccessAdditionWrongValue() {
        assertNotEquals(99, calculator.addition(8, 2));
    }

    @Test
    public void testSuccessAdditionNegativeValue() {
        assertEquals(-9, calculator.addition(-5, -4));
    }

    @Test
    public void testSuccessAdditionDecimalValue() {
        assertEquals(5.8, calculator.addition(3.4, 2.4));
    }

    // SUBTRACTION

    @Test
    public void testSuccessSubtraction() {
        assertEquals(0d, calculator.subtraction(5d, 5d));
    }

    @Test
    public void testSuccessSubtractionWrongValue() {
        assertNotEquals(9999d, calculator.subtraction(12d, 15d));
    }

    @Test
    public void testSuccessSubtractionDecimal() {
        assertEquals(2.1d, calculator.subtraction(10.3d, 8.2d));
    }

    @Test
    public void testSuccessSubtractionBothNegativeValue() {
        assertEquals(-4d, calculator.subtraction(-10d, -6d));
    }

    @Test
    public void testSuccessSubtractionNegativeValue() {
        assertEquals(-16d, calculator.subtraction(-10d, 6d));
    }

    // MULTIPLY

    @Test
    public void testSuccessMultiply() {
        assertEquals(25d, calculator.multiply(5d, 5d));
    }

    @Test
    public void testSuccessMultiplyWrongValue() {
        assertNotEquals(999d, calculator.subtraction(10d, 10d));
    }

    @Test
    public void testSuccessMultiplyDecimal() {
        assertEquals(0.25d, calculator.multiply(0.5d, 0.5d));
    }

    @Test
    public void testSuccessMultiplyNegativeValue() {
        assertEquals(-27d, calculator.multiply(9d, -3d));
    }

    @Test
    public void testSuccessMultiplyBothNegativeValue() {
        assertEquals(27d, calculator.multiply(-9d, -3d));
    }

    // DIVIDE

    @Test
    public void testSuccessDivide() throws Exception {
        assertEquals(1d, calculator.divide(5d, 5d));
    }

    @Test
    public void testSuccessDivideWrongValue() throws Exception {
        assertNotEquals(555d, calculator.divide(10d, 5d));
    }

    @Test
    public void testSuccessDivideDecimal() throws Exception {
        assertEquals(4d, calculator.divide(2d, 0.5d));
    }

    @Test
    public void testSuccessDivideNegativeValue() throws Exception {
        assertEquals(-5d, calculator.divide(10d, -2d));
    }

    @Test
    public void testSuccessDivideBothNegativeValue() throws Exception {
        assertEquals(5d, calculator.divide(-20d, -4d));
    }

    @Test
    public void testSuccessDivideByZero() {
        assertThrows(Exception.class, () -> calculator.divide(5d, 0d));
    }

    @Test
    public void testSuccessDivideByNegativeZero() {
        assertThrows(Exception.class, () -> calculator.divide(5d, -0d));
    }

}
