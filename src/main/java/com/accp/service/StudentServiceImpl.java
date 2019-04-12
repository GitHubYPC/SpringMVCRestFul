package com.accp.service;

import com.accp.dao.StudentDao;
import com.accp.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YPC
 * @create 2018 12 24 14:30
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao sd;
    public List<Student> findAll() {
        return sd.findAll();
    }

    public Student findById(int id) {
        return sd.findById(id);
    }

    public int insert(Student stu) {
        return sd.insert(stu);
    }

    public int update(Student stu) {
        return sd.update(stu);
    }

    public int delete(int id) {
        return sd.delete(id);
    }
}
