package com.lsh.springboot.service;

import com.lsh.springboot.model.Student;
import com.lsh.springboot.utils.PageBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStudentService {

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    @Transactional(readOnly = true)
    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    @Transactional(readOnly = true)
    List<Student> listbook(Student record, PageBean pageBean);
}
