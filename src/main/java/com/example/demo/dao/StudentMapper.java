package com.example.demo.dao;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudentMapper extends Mapper<Student> {

    List<StudentInfo> getAllStudentInfo();
}
