package mvc_hibernate_aop.service;

import mvc_hibernate_aop.entity.Employee;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

   public void deleteEmployee(int id);
}


