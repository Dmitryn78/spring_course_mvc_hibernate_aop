package mvc_hibernate_aop.service;

import mvc_hibernate_aop.entity.Employee;
import mvc_hibernate_aop.mvc_hibernate_dao.EmployeeDao;
import mvc_hibernate_aop.mvc_hibernate_dao.EmployeeDaoImpl;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);

    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }
}
