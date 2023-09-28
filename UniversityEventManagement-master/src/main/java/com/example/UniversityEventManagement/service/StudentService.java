package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.StudentDepartment;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.respository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public String addStudent(Student student) {
        if(student != null){
            studentRepo.save(student);
            return "Student added successfully";
        }
        return "Invalid data";
    }
}
