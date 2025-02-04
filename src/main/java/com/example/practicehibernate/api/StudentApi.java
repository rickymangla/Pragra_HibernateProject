package com.example.practicehibernate.api;

import com.example.practicehibernate.entity.Student;
import com.example.practicehibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        ResponseEntity<Student> responseEntity = null;
        try {
            Student student1 = studentService.addStudent(student);
            responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(201))
                    .header("Origin", "studentsList")
                    .header("error-code", "1000s")
                    .body(student1);
        } catch (Exception e) {
            responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(503))
                    .header("error-code", "3002")
                    .body(null);
        }
        return responseEntity;

//        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(name = "id") Integer id) {
        ResponseEntity<Student> responseEntity = null;
        try {
            responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(200))
                    .header("origin", "studentList")
                    .header("error-code", "2003")
                    .body(studentService.getStudentById(id));
        } catch (Exception e) {
            responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(504))
                    .header("error-code", "4003")
                    .body(null);
        }
        return responseEntity;

        //return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(name = "id") Integer id) {
//        ResponseEntity<String> responseEntity = null;
//        try {
//            boolean result = studentService.deleteStudentById(id);
//            if (result) {
//                responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(200))
//                        .header("error-code", "6754")
//                        .body("Student deleted successfully");
//            }
//        } catch (Exception e) {
//            responseEntity = ResponseEntity.status(HttpStatusCode.valueOf(500))
//                    .header("error-code", "2003")
//                    .body("Student could not be deleted");
//        }
//
//        return responseEntity;


        boolean result = studentService.deleteStudentById(id);
        if (result) {
            return "Student deleted successfully";
        } else {
            return "Student could not be deleted";
        }
    }
}
