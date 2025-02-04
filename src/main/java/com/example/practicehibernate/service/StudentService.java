package com.example.practicehibernate.service;

import com.example.practicehibernate.entity.Student;
import com.example.practicehibernate.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public boolean deleteStudentById(int id) {
        if (studentRepo.findById(id).isPresent()) {
            studentRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
