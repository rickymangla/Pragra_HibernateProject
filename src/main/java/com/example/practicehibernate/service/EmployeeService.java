package com.example.practicehibernate.service;

import com.example.practicehibernate.entity.*;
import com.example.practicehibernate.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.method.support.CompositeUriComponentsContributor;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private CourseRepo courseRepo;


    public Employee addEmployee(@RequestBody Employee employee) {
        Department department = employee.getDepartment();
        departmentRepo.save(department);
        List<Orders> orders = employee.getOrders();
        orderRepo.saveAll(orders);
//        Book book = employee.getBook();
//        bookRepo.save(book);
//        Set<Course> course = employee.getCourse();
//        courseRepo.saveAll(course);
//        Book book = new Book();
//        book.setEmployee(employee);
//        bookRepo.save(book);
        
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
        if (repo.findById(empId).isPresent()) {
            repo.deleteById(empId);
            return true;
        } else {
            return false;
        }
    }

    public String findEmployeeById(Integer id) {
        return repo.findById(id).get().getDepartment().getDepartmentLocation();
      //  return repo.findById(id).get();
    }

//    public Employee findEmployeeById(Integer id) {
//      //  return repo.findById(id).get().getDepartment().getDepartmentLocation();
//          return repo.findById(id).get();
//    }

    public Employee findEmployeeByEmailId(String emailId) {
        return repo.findByEmailId(emailId);
    }

    public Employee findEmployee(String firstName, String lastName) {
        return repo.findEmployee(firstName, lastName);
    }

}
