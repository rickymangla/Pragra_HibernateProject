package com.example.practicehibernate.service;

import com.example.practicehibernate.entity.Department;
import com.example.practicehibernate.entity.Employee;
import com.example.practicehibernate.repo.DepartmentRepo;
import com.example.practicehibernate.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    @Autowired
    private DepartmentRepo departmentRepo;

    public Employee addEmployee(@RequestBody Employee employee) {
        Department department = employee.getDepartment();
        departmentRepo.save(department);
        return repo.save(employee);
    }

    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return repo.saveAll(employees);
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public List<Employee> getEmployeeByFirstName(String firstName) {
        return repo.findAllByFirstName(firstName);
    }

    public boolean deleteEmployee(Integer empId) {
        if(repo.findById(empId).isPresent()) {
            repo.deleteById(empId);
            return true;
        }
        else {
            return false;
        }
    }

    public Employee findEmployeeByEmailId(String emailId) {
        return repo.findByEmailId(emailId);
    }

    public Employee findEmployee(String firstName, String lastName) {
        return repo.findEmployee(firstName, lastName);
    }

}
