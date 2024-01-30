package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
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

    @Test
    @DisplayName("Testing with negativ numbers")
    void testingWithNegativNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.Add("1,-2,3,-4");
        });

        assertEquals("Negatives not allowed: -2, -4", exception.getMessage());
    }

    @Test
    @DisplayName("Testing if it works with numbers bigger than 1000")
    void testingIfItWorksWithNumbersBiggerThan1000() {
        assertEquals(2, StringCalculator.Add("2,1001"));
    }

    @Test
    @DisplayName("Testing delimiters of any lenght")
    void testingDelimitersOfAnyLenght() {
        assertEquals(6, StringCalculator.Add("//[***]\n1***2***3"));
    }

    @Test
    @DisplayName("Testing delimiters with multiple characters")
    void testingDelimitersWithMultipleCharacters() {
        assertEquals(6, StringCalculator.Add("//[*][%]\n1*2%3"));
    }
}