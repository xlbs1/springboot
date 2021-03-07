package com.lsh.springboot.service.impl;

import com.lsh.springboot.mapper.StudentMapper;
import com.lsh.springboot.model.Student;
import com.lsh.springboot.service.IStudentService;
import com.lsh.springboot.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return studentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> listbook(Student record, PageBean pageBean) {
        return studentMapper.listbook(record);
    }
}
