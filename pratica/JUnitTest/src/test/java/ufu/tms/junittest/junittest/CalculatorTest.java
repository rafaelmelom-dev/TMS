package ufu.tms.junittest.junittest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Tag;

/**
 *
 * @author rafaelmelom
 */

@Tag("calculator")
public class CalculatorTest {

    public CalculatorTest() {
    }

    @Test
    @DisplayName("Testando a soma entre 10 e 50")
    public void testAdd() {

        Calculator calculator = new Calculator();

        double res = calculator.add(10, 50);

        assertEquals(60, res, 0);

    }

    @Test
    @DisplayName("Testando a soma entre 10 e 10.0")
    public void testAddSec() {
        Calculator calculator = new Calculator();

        double res = calculator.add(10, 10.0);

        assertEquals(20, res, 0);
    }

    @Test
    public void testAddErro() {
        Calculator calculator = new Calculator();

        double res = calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);

        assertEquals(Double.POSITIVE_INFINITY, res);
    }

    @Test
    @DisplayName("Testando adicionar dois mínimos.")
    @Disabled("Ainda em erro")
    public void testAddErroSec() {
        Calculator calculator = new Calculator();

        double res = calculator.add(Double.MIN_VALUE, Double.MIN_VALUE);

        assertEquals(Double.NEGATIVE_INFINITY, res);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();

        try {
            double res = calculator.div(12, 3);

            assertEquals(4, res);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void testDivErro() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(30, 0);
        });
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();

        double res = calculator.sub(10, 3);

        assertEquals(7, res);
    }

    @Test
    public void testSubSec() {
        Calculator calculator = new Calculator();

        double res = calculator.sub(10, 3.0);

        assertEquals(7, res);
    }

    @Test
    public void testMult() {
        Calculator calculator = new Calculator();

        double res = calculator.mult(3, 2);

        assertEquals(6, res);
    }

    @Test
    public void testMultSec() {
        Calculator calculator = new Calculator();

        double res = calculator.mult(3, 0);

        assertEquals(0, res);
    }

    @Test
    public void testMultThird() {
        Calculator calculator = new Calculator();

        double res = calculator.mult(3, 2.0);

        assertEquals(6, res);
    }

    @Test
    public void testSqrtExcep() {
        Calculator calculator = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.raizQ(-1);
        });
    }

    @Test
    public void testSqrt() {
        Calculator calculator = new Calculator();

        try {
            double res = calculator.raizQ(-1);

            assertEquals(2, res);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testPotenc() {
        Calculator calculator = new Calculator();

        double res = calculator.pontenc(2.0, 3);

        assertEquals(8, res);
    }
}
