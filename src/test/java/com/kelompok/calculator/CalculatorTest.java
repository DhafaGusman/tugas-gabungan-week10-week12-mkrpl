package com.kelompok.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

   class CalculatorTest {

       private Calculator calc;

       @BeforeEach
       void setUp() {
           calc = new Calculator();
       }

       @Test
       void testAdd() {
           assertEquals(15.0, calc.add(10, 5), "10 + 5 harus = 15");
       }

       @Test
       void testSubtract() {
           assertEquals(5.0, calc.subtract(10, 5), "10 - 5 harus = 5");
       }

       @Test
       void testMultiply() {
           assertEquals(50.0, calc.multiply(10, 5), "10 * 5 harus = 50");
       }

       @Test
       void testDivide() {
           assertEquals(2.0, calc.divide(10, 5), "10 / 5 harus = 2");
       }

       @Test
       void testDivideByZero() {
           assertThrows(ArithmeticException.class, () -> calc.divide(10, 0),
               "Bagi nol harus melempar ArithmeticException");
       }

       @Test
       void testModulo() {
           assertEquals(1.0, calc.modulo(10, 3), "10 % 3 harus = 1");
       }

       @Test
       void testPower() {
           assertEquals(256.0, calc.power(2, 8), "2^8 harus = 256");
       }
   }