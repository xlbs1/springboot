package com.lsh.springboot.service.impl;

import com.lsh.springboot.model.Student;
import com.lsh.springboot.service.IStudentService;
import com.lsh.springboot.utils.PageBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {

    @Autowired
    private IStudentService studentService;
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }



    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
        Student student = studentService.selectByPrimaryKey(1);
        System.out.println(student);
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }

    @Test
    void listbook() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(3);
        List<Student> listbook = studentService.listbook(student, pageBean);
        for (Student student1 : listbook) {
            System.out.println(student1);
        }
    }
}