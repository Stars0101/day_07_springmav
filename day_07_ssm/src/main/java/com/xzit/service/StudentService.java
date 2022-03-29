package com.xzit.service;

import com.xzit.entity.Student;

import java.util.List;

public interface StudentService  {
    void save(Student student);
    List<Student> SelectList();
    void delete(int id);
}
