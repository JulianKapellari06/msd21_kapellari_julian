package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private  Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddSimple() {

        Assertions.assertEquals(8, calculator.add(5, 3));

    }

    @Test
    void testAddComplicated() {

        double result = 3 + 5;
        Assertions.assertEquals(result, calculator.add(5, 3));

    }
    @Test
    void testMinusSimple() {

        Assertions.assertEquals(2, calculator.minus(5, 3));

    }

    @Test
    void testMinusComplicated() {

        double result = 5-3;
        Assertions.assertEquals(result, calculator.minus(5, 3));

    }@Test
    void testMulSimple() {

        Assertions.assertEquals(15, calculator.multiply(5, 3));

    }

    @Test
    void testMulComplicated() {

        double result = 3 * 5;
        Assertions.assertEquals(result, calculator.multiply(5, 3));

    }
    @Test
    void testDivSimple() {

        Assertions.assertEquals(1.666666, calculator.divide(5, 3),0.0001);

    }

    @Test
    void testDivComplicated() {

        double result = 5/3.0;
        Assertions.assertEquals(result, calculator.divide(5, 3), 0.0001);

    }
    @Test
    void testDivByZeroComplicated() {

        assertThrows(ArithmeticException.class,()-> calculator.divide(2,0));
    }
   /* @Test
    void testFacultySimple() {

        Assertions.assertEquals(120, calculator.faculty(5));

    }

    @Test
    void testFacultyComplicated() {

        Assertions.assertEquals(362880, calculator.faculty(9));

    }*/



}
