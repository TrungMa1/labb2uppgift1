package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

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

    @Test
    @DisplayName("Testing get salary")
    void testingGetSalary() {
        Employee employee = new Employee("123", 50000.0);
        assertEquals(50000.0, employee.getSalary(), 0.001);
    }

    @Test
    @DisplayName("Testing set salary")
    void testingSetSalary() {
        Employee employee = new Employee("123", 50000.0);
        employee.setSalary(60000.0);
        assertEquals(60000.0, employee.getSalary(), 0.001);
    }

    @Test
    @DisplayName("Testing is paid")
    void testingIsPaid() {
        Employee employee = new Employee("123", 50000.0);
        assertFalse(employee.isPaid());
    }

    @Test
    @DisplayName("Testing set paid")
    void testingSetPaid() {
        Employee employee = new Employee("123", 50000.0);
        employee.setPaid(true);
        assertTrue(employee.isPaid());
    }
}
