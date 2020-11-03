package com.jxd.mybatisPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.mybatisPlus.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/1 13:30
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
@Repository
public interface IStudentMapper extends BaseMapper<Student> {
    List<Map<String,Object>> getStudentInfoListByClassNo(@Param("classNo") int classNo);

    List<Map<String,Object>> getStudentInfoListByClassNo2(@Param("classNo") int classNo,@Param("list")List<Integer> list,@Param("list1")List<Integer> list1,@Param("name")String name,@Param("startIndex")Integer startInedx ,@Param("pageSize")Integer pageSize);

    int deleteStudentById(Integer id);
    }
