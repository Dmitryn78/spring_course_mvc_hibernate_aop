package mvc_hibernate_aop.mvc_hibernate_dao;

import mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
}
