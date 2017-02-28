package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTests {

    Calculator calculator;

    public CalculatorTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void adding_1_and_1_should_equal_2() {
        int expected = 2;
        int result = calculator.add(1, 1);

        assertEquals(expected, result);
    }

    @Test
    public void adding_minus1_and_1_should_equal_0() {
        int expected = 0;
        int result = calculator.add(-1, 1);

        assertEquals(expected, result);
    }

    @Test
    public void subtracting_6_from_10_should_equal_4() {
        int expected = 4;
        int result = calculator.subtract(10, 6);

        assertEquals(expected, result);
    }

    @Test
    public void subtracting_10_from_8_should_equal_minus2() {
        int expected = -2;
        int result = calculator.subtract(8, 10);

        assertEquals(expected, result);
    }

    @Test
    public void multiplying_5_and_4_should_equal_20() {
        int expected = 20;
        int result = calculator.multiply(5, 4);

        assertEquals(expected, result);
    }

    @Test
    public void multiplying_5_and_minus4_should_equal_minus20() {
        int expected = -20;
        int result = calculator.multiply(5, -4);

        assertEquals(expected, result);
    }

    @Test
    public void dividing_36_by_2_should_equal_18() {
        int expected = 18;
        int result = calculator.divide(36, 2);

        assertEquals(expected, result);
    }

    @Test
    public void dividing_0_by_100_should_equal_zero() {
        int expected = 0;
        int result = calculator.divide(0, 100);

        assertEquals(expected, result);
    }

    @Test
    public void dividing_1_by_0_should_equal_infinity() {
        int expected = Integer.MAX_VALUE;
        int result = calculator.divide(1, 0);

        assertEquals(expected, result);
    }

    @Test
    public void dividing_1L_by_0L_should_equal_infinityL() {
        long expected = Long.MAX_VALUE;
        long result = calculator.divide(1L, 0L);

        assertEquals(expected, result);
    }

    @Test
    public void dividing_1d_by_0d_should_equal_infinityD() {
        double expected = Double.MAX_VALUE;
        double result = calculator.divide(1d, 0d);

        assertEquals(expected, result);
    }
}
