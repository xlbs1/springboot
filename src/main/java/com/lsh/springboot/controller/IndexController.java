package com.lsh.springboot.controller;

import com.lsh.springboot.model.Student;
import com.lsh.springboot.service.IStudentService;
import com.lsh.springboot.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class IndexController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/index")
    public Map<String,Object> list(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Student> listbook = studentService.listbook(new Student(), new PageBean());
        map.put("liststudent",listbook);
        return map;
    }
}
