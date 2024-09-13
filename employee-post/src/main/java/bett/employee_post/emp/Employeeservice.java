package bett.employee_post.emp;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Employeeservice {
    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
}







