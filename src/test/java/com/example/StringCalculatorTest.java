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
        assertEquals(16, StringCalculator.Add("3,8,5"));
    }
}