package com.example.practicehibernate.service;

import com.example.practicehibernate.entity.Department;
import com.example.practicehibernate.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo deptRepo;

    public boolean deleteDepartmentById(int deptId) {
        if (deptRepo.findById(deptId).isPresent()) {
            deptRepo.deleteById(deptId);
            return true;
        } else {
            return false;
        }

    }
}
