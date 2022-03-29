package com.xzit.service;

import com.xzit.entity.Student;
import com.xzit.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public void save(Student student) {
        studentMapper.save(student);
    }

    @Override
    public List<Student> SelectList() {
        return studentMapper.selectList();
    }

    @Override
    public void delete(int id) {
        studentMapper.delete(id);
    }
}
