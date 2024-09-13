package bett.employee.emp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public List<Employee> getEmployees(){
        return List.of(
            new Employee(0, "james", "bett", "jb@me.com", "manager"),
            new Employee(1, "jame", "btt", "jd@me.com", "worker"),
            new Employee(2, "jams", "bet", "ja@me.com", "worker"),
            new Employee(3, "jaes", "ett", "jc@me.com", "worker")
        );
    }

}
