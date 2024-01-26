package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EmployeesTest {

    @Mock
    EmployeeRepository employeeRepository;

    @Mock
    BankService bankService;

    @InjectMocks
    Employees employees;

    @Test
    @DisplayName("Testing if employees are getting paid")
    void testingIfEmployeesAreGettingPaid() {

        List<Employee> employeesList = Arrays.asList(
                new Employee("1", 50000.0),
                new Employee("2", 60000.0)
        );

        when(employeeRepository.findAll()).thenReturn(employeesList);
        when(bankService.pay(anyString(), anyDouble())).thenReturn(true);

        int payments = employees.payEmployees();

        assertEquals(2, payments);

        verify(employeeRepository, times(1)).findAll();
        verify(bankService, times(2)).pay(anyString(), anyDouble());
    }
}