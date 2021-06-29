package com.example.question_pool.dao;

import com.example.question_pool.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuNo);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuNo);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}