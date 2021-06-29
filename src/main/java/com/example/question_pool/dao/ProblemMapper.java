package com.example.question_pool.dao;

import com.example.question_pool.entity.Problem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wei
 */
@Mapper
@Repository
public interface ProblemMapper {
    /**
     * @param proNo 问题的序列号
     * @return 删除的问题的序列号
     * @func   从数据库中删除相应的题
     */
    @Delete("delete from problem where pro_no=#{proNo}")
    public int deleteByPrimaryKey(Integer proNo);


    @Insert("insert into problem (pro_detail,pro_ansno,pro_keyw,pro_dif,pro_type,cha_no,cha_title,cha_mpoint) values" +
            "(#{proDetail},#{proAnsno},#{proKeyw},#{proDif},#{proType},#{chaNo},#{chaTitle},#{chaMpoint})")
    public int insert(Problem record);



    @Select("select pro_no,pro_detail,pro_ansno,pro_keyw,pro_dif,pro_type,cha_no,cha_title,cha_mpoint" +
            " from problem where pro_no=#{proNo}")
    @Results(id = "problemMap", value = {
            @Result(column = "pro_no", property = "proNo"),
            @Result(column = "pro_detail", property = "proDetail"),
            @Result(column = "pro_ansno",property = "proAnsno"),
            @Result(column = "pro_keyw",property = "proKeyw"),
            @Result(column = "pro_dif",property = "proDif"),
            @Result(column = "pro_type", property = "proType"),
            @Result(column = "cha_no",property = "chaNo"),
            @Result(column = "cha_title",property = "chaTitle"),
            @Result(column = "cha_mpoint",property = "chaMpoint")
    }
    )
    Problem selectByPrimaryKey(Integer proNo);

    @Select("select pro_no,pro_detail,pro_ansno,pro_keyw,pro_dif,pro_type,cha_no,cha_title,cha_mpoint" +
            " from problem")
    @ResultMap(value = "problemMap")
    List<Problem> selectAllProblems();


    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKeyWithBLOBs(Problem record);

    @Update("update problem set pro_detail=#{proDetail},pro_ansno=#{proAnsno}," +
            "pro_keyw=#{proKeyw},pro_dif=#{proDif},pro_type=#{proType}," +
            "cha_no=#{chaNo},cha_title=#{chaTitle},cha_mpoint=#{chaMpoint}" +
            " where pro_no=#{proNo}")
    int updateByPrimaryKey(Problem record);
}