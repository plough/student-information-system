package me.baimoz.demo.student.information.system.service;

import me.baimoz.demo.student.information.system.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpaDesc();
    Student saveOrUpdateStudent(Student student);
    void deleteStudentById(String id);
}