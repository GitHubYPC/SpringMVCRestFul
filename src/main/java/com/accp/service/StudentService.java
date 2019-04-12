package com.accp.service;

import com.accp.po.Student;

import java.util.List;

/**
 * @author YPC
 * @create 2018 12 24 14:30
 */
public interface StudentService {
    public List<Student> findAll();

    public Student findById(int id);

    public int insert(Student stu);

    public int update(Student stu);

    public int delete(int id);
}
