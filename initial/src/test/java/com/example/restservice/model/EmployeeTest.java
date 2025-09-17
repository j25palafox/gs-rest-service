package com.example.restservice.model;
import com.example.restservice.model.Employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructorAndGetters() {
        Employee employee = new Employee(1, "Alice", "Wonderland", "alice@wonderland.com", "CEO");

        assertEquals(1, employee.getEmployee_id());
        assertEquals("Alice", employee.getFirst_name());
        assertEquals("Wonderland", employee.getLast_name());
        assertEquals("alice@wonderland.com", employee.getEmail());
        assertEquals("CEO", employee.getTitle());
    }
}

