package com.example.demo.dao;

import com.example.demo.pojo.School;
import com.example.demo.pojo.SchoolCount;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SchoolMapper extends Mapper<School> {

    List<SchoolCount> getSchoolCount();
}
