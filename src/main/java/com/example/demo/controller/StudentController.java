package com.example.demo.controller;

import com.example.demo.dao.StudentMapper;
import com.example.demo.pojo.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/get2")
    public List<StudentInfo> get2(){
        return studentMapper.getAllStudentInfo();
    }
}
