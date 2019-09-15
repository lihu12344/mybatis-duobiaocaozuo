package com.example.demo.controller;

import com.example.demo.dao.SchoolMapper;
import com.example.demo.pojo.SchoolCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolMapper schoolMapper;

    @RequestMapping("/get")
    public List<SchoolCount> get(){
        return schoolMapper.getSchoolCount();
    }
}
