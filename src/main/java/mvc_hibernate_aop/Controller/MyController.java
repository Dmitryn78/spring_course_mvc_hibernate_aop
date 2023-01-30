package mvc_hibernate_aop.Controller;


import mvc_hibernate_aop.entity.Employee;
import mvc_hibernate_aop.mvc_hibernate_dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDao employeeDao;



    @RequestMapping("/")
    public String showAllEmployees(Model model) {
       List<Employee> allEmployees = employeeDao.getAllEmployees();
       model.addAttribute("allEmps",allEmployees);
          return "all_employees";
    }
}
