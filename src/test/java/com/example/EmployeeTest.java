package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class EmployeeTest {

    @Test
    @DisplayName("Testing get ID")
    void testingGetID() {
        Employee employee = new Employee("123", 50000.0);
        assertEquals("123", employee.getId());
    }

    @Test
    @DisplayName("Testing set ID")
    void testingSetId() {
        Employee employee = new Employee("123", 50000.0);
        employee.setId("456");
        assertEquals("456", employee.getId());
    }
}
