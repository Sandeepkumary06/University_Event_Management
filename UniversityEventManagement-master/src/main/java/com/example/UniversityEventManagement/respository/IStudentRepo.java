package com.example.UniversityEventManagement.respository;

import com.example.UniversityEventManagement.model.StudentDepartment;
import com.example.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
}
