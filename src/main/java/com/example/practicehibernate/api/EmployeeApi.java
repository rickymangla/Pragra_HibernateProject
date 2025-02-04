package com.example.practicehibernate.api;

import com.example.practicehibernate.entity.Department;
import com.example.practicehibernate.entity.Employee;
import com.example.practicehibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.addEmployees(employees);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/findByFirstName")
    public List<Employee> findByFirstName(@RequestParam (name="firstName") String name) {
        return employeeService.getEmployeeByFirstName(name);
    }

    @GetMapping("/findById/{id}")
    public String findEmployeeById(@PathVariable (name="id") Integer id) {
        return employeeService.findEmployeeById(id);
    }

//    @GetMapping("/findById/{id}")
//    public Employee findEmployeeById(@PathVariable (name="id") Integer id) {
//        return employeeService.findEmployeeById(id);
//    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (name="id") Integer empId) {
        if(employeeService.deleteEmployee(empId)) {
            return "Employee deleted successfully";
        }
        else {
            return "Employee not found";
        }
    }

    @GetMapping("/findEmployeeByEmailId")
    public Employee findEmployeeByEmailId(@RequestParam (name="emailId") String email) {
        return employeeService.findEmployeeByEmailId(email);
    }

    @GetMapping("/findEmployee")
    public Employee findEmployee(@RequestParam (name="firstName") String firstName, @RequestParam (name="lastName") String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

}
