package com.example.service;

import com.example.entity.Student;
import java.util.List;

public interface StudentService {
    
    Student saveStudent(Student student);
    
    List<Student> getAllStudents();
    
    Student getStudentById(Long id);
    
    Student updateStudent(Student student, Long id);
    
    void deleteStudent(Long id);
}
