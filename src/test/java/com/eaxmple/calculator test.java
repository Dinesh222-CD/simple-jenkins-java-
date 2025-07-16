package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for Calculator
 * 
 * @author Your Name
 * @version 1.0.0
 */
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Nested
    @DisplayName("Basic Arithmetic Operations")
    class BasicArithmeticTests {
        
        @Test
        @DisplayName("Test addition of two positive integers")
        void testAddIntegers() {
            int result = calculator.add(5, 3);
            assertEquals(8, result, "5 + 3 should equal 8");
        }
        
        @Test
        @DisplayName("Test addition of two double values")
        void testAddDoubles() {
            double result = calculator.add(5.5, 3.2);
            assertEquals(8.7, result, 0.001, "5.5 + 3.2 should equal 8.7");
        }
        
        @Test
        @DisplayName("Test addition with negative numbers")
        void testAddNegative() {
            int result = calculator.add(-5, 3);
            assertEquals(-2, result, "-5 + 3 should equal -2");
        }
        
        @Test
        @DisplayName("Test subtraction of two positive integers")
        void testSubtractIntegers() {
            int result = calculator.subtract(10, 4);
            assertEquals(6, result, "10 - 4 should equal 6");
        }
        
        @Test
        @DisplayName("Test subtraction of two double values")
        void testSubtractDoubles() {
            double result = calculator.subtract(10.5, 4.2);
            assertEquals(6.3, result, 0.001, "10.5 - 4.2 should equal 6.3");
        }
        
        @Test
        @DisplayName("Test multiplication of two positive integers")
        void testMultiplyIntegers() {
            int result = calculator.multiply(6, 7);
            assertEquals(42, result, "6 * 7 should equal 42");
        }
        
        @Test
        @DisplayName("Test multiplication of two double values")
        void testMultiplyDoubles() {
            double result = calculator.multiply(2.5, 4.0);
            assertEquals(10.0, result, 0.001, "2.5 * 4.0 should equal 10.0");
        }
        
        @Test
        @DisplayName("Test multiplication with zero")
        void testMultiplyWithZero() {
            int result = calculator.multiply(5, 0);
            assertEquals(0, result, "5 * 0 should equal 0");
        }
        
        @Test
        @DisplayName("Test division of two positive integers")
        void testDivideIntegers() {
            int result = calculator.divide(15, 3);
            assertEquals(5, result, "15 / 3 should equal 5");
        }
        
        @Test
        @DisplayName("Test division of two double values")
        void testDivideDoubles() {
            double result = calculator.divide(15.0, 3.0);
            assertEquals(5.0, result, 0.001, "15.0 / 3.0 should equal 5.0");
        }
        
        @Test
        @DisplayName("Test division by zero throws exception (integers)")
        void testDivideByZeroIntegers() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.divide(10, 0);
            }, "Division by zero should throw IllegalArgumentException");
        }
        
        @Test
        @DisplayName("Test division by zero throws exception (doubles)")
        void testDivideByZeroDoubles() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.divide(10.0, 0.0);
            }, "Division by zero should throw IllegalArgumentException");
        }
    }
    
    @Nested
    @DisplayName("Advanced Mathematical Operations")
    class AdvancedOperationsTests {
        
        @Test
        @DisplayName("Test power calculation")
        void testPower() {
            double result = calculator.power(2.0, 3.0);
            assertEquals(8.0, result, 0.001, "2^3 should equal 8.0");
        }
        
        @Test
        @DisplayName("Test power with zero exponent")
        void testPowerWithZeroExponent() {
            double result = calculator.power(5.0, 0.0);
            assertEquals(1.0, result, 0.001, "Any number to the power of 0 should equal 1.0");
        }
        
        @Test
        @DisplayName("Test square root of positive number")
        void testSquareRoot() {
            double result = calculator.squareRoot(16.0);
            assertEquals(4.0, result, 0.001, "Square root of 16 should equal 4.0");
        }
        
        @Test
        @DisplayName("Test square root of zero")
        void testSquareRootOfZero() {
            double result = calculator.squareRoot(0.0);
            assertEquals(0.0, result, 0.001, "Square root of 0 should equal 0.0");
        }
        
        @Test
        @DisplayName("Test square root of negative number throws exception")
        void testSquareRootOfNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.squareRoot(-4.0);
            }, "Square root of negative number should throw IllegalArgumentException");
        }
        
        @Test
        @DisplayName("Test factorial of positive number")
        void testFactorial() {
            long result = calculator.factorial(5);
            assertEquals(120, result, "5! should equal 120");
        }
        
        @Test
        @DisplayName("Test factorial of zero")
        void testFactorialOfZero() {
            long result = calculator.factorial(0);
            assertEquals(1, result, "0! should equal 1");
        }
        
        @Test
        @DisplayName("Test factorial of one")
        void testFactorialOfOne() {
            long result = calculator.factorial(1);
            assertEquals(1, result, "1! should equal 1");
        }
        
        @Test
        @DisplayName("Test factorial of negative number throws exception")
        void testFactorialOfNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.factorial(-5);
            }, "Factorial of negative number should throw IllegalArgumentException");
        }
        
        @Test
        @DisplayName("Test prime number detection - prime numbers")
        void testIsPrimePositive() {
            assertTrue(calculator.isPrime(2), "2 should be prime");
            assertTrue(calculator.isPrime(3), "3 should be prime");
            assertTrue(calculator.isPrime(5), "5 should be prime");
            assertTrue(calculator.isPrime(17), "17 should be prime");
            assertTrue(calculator.isPrime(29), "29 should be prime");
        }
        
        @Test
        @DisplayName("Test prime number detection - non-prime numbers")
        void testIsPrimeNegative() {
            assertFalse(calculator.isPrime(1), "1 should not be prime");
            assertFalse(calculator.isPrime(4), "4 should not be prime");
            assertFalse(calculator.isPrime(16), "16 should not be prime");
            assertFalse(calculator.isPrime(25), "25 should not be prime");
            assertFalse(calculator.isPrime(0), "0 should not be prime");
            assertFalse(calculator.isPrime(-5), "-5 should not be prime");
        }
    }
    
    @Nested
    @DisplayName("Utility Operations")
    class UtilityOperationsTests {
        
        @Test
        @DisplayName("Test absolute value of positive number")
        void testAbsPositive() {
            double result = calculator.abs(5.5);
            assertEquals(5.5, result, 0.001, "abs(5.5) should equal 5.5");
        }
        
        @Test
        @DisplayName("Test absolute value of negative number")
        void testAbsNegative() {
            double result = calculator.abs(-5.5);
            assertEquals(5.5, result, 0.001, "abs(-5.5) should equal 5.5");
        }
        
        @Test
        @DisplayName("Test percentage calculation")
        void testPercentage() {
            double result = calculator.percentage(200.0, 15.0);
            assertEquals(30.0, result, 0.001, "15% of 200 should equal 30.0");
        }
        
        @Test
        @DisplayName("Test rounding to decimal places")
        void testRounding() {
            double result = calculator.round(3.14159, 2);
            assertEquals(3.14, result, 0.001, "3.14159 rounded to 2 decimal places should equal 3.14");
        }
        
        @Test
        @DisplayName("Test rounding with zero decimal places")
        void testRoundingInteger() {
            double result = calculator.round(3.7, 0);
            assertEquals(4.0, result, 0.001, "3.7 rounded to 0 decimal places should equal 4.0");
        }
    }
}
