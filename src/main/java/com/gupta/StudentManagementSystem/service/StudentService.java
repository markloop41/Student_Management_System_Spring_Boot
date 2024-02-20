package com.gupta.StudentManagementSystem.service;

import com.gupta.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    Student saveStudent(Student student);

    void deleteStudentById(Long id);
}
