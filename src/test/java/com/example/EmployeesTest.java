package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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


    }
}
