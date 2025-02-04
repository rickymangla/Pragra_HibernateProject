package com.example.practicehibernate.api;

import com.example.practicehibernate.entity.Department;
import com.example.practicehibernate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")

public class DepartmentApi {
    @Autowired
    private DepartmentService deptService;
    @DeleteMapping("/deptId/{id}")
    public String deleteDepartment(@PathVariable(name="id") Integer deptId) {
        if(deptService.deleteDepartmentById(deptId)) {
            return "Department deleted successfully";
        }
        else {
            return "Department not found";
        }
    }
}
