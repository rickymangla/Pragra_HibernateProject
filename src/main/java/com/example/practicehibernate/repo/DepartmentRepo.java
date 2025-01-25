package com.example.practicehibernate.repo;

import com.example.practicehibernate.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

//    @Query("Insert into Department dept values ()")
//    Department addDepartment(String deptName, String deptLocation);
}
