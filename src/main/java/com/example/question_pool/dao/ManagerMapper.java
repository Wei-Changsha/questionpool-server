package com.example.question_pool.dao;

import com.example.question_pool.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper {
    int deleteByPrimaryKey(Integer manaNo);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer manaNo);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}