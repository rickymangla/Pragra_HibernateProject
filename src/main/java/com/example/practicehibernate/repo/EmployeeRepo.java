package com.example.practicehibernate.repo;

import com.example.practicehibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByFirstName(String firstName);

    @Query("Select emp from Employee emp where emp.email= :emailId")
    Employee findByEmailId(String emailId);

    @Query("Select emp from Employee emp where emp.firstName= :firstName And emp.lastName= :lastName")
    Employee findEmployee(String firstName, String lastName);
}
