package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

class StringCalculatorTest {

    @Test
    @DisplayName("Testing an empty string")
    void testingAnEmptyString() {
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    @DisplayName("Testing if it works with one number")
    void testingIfItWorksWithOneNumber() {
        assertEquals(5, StringCalculator.Add("5"));
    }

    @Test
    @DisplayName("Testing if it works with multiple numbers")
    void testingIfItWorksWithMultipleNumbers() {
        assertEquals(15, StringCalculator.Add("1,2,3,4,5"));
    }

    @Test
    @DisplayName("Testing numbers with a new line")
    void testingNumbersWithANewLine() {
        assertEquals(6, StringCalculator.Add("1\n2\n3"));
    }

    @Test
    @DisplayName("Testing all kinds of delimiters")
    void testingAllKindsOfDelimiters() {
        assertEquals(3, StringCalculator.Add("//;\n1;2"));
    }
}