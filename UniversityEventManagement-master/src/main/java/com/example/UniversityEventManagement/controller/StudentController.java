package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.model.StudentDepartment;
import com.example.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("SC")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/students")
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }
    @PutMapping("/student/{studentId}/{studentDepartment}")
    public String updateByStudentIdAndStudentDepartment(@PathVariable Integer studentId, @PathVariable StudentDepartment studentDepartment){
        return studentService.updateByStudentIdAndStudentDepartment(studentId,studentDepartment);
    }
    @GetMapping("/student/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }
    @DeleteMapping("/student/{studentId}")
    public String deleteStudentById(@PathVariable Integer studentId){
        return studentService.deleteStudentById(studentId);
    }
}
