package com.accp.dao;

import com.accp.po.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YPC
 * @create 2018 12 24 14:28
 */
@Repository
public interface StudentDao {
    public List<Student> findAll();

    public Student findById(int id);

    public int insert(Student stu);

    public int update(Student stu);

    public int delete(int id);
}
