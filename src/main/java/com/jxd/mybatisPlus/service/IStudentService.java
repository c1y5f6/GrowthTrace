package com.jxd.mybatisPlus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.mybatisPlus.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/1 13:31
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
public interface IStudentService extends IService<Student> {
    public List<Map<String,Object>> getCourseByClass(int classNo,String name,Integer startIndex,Integer pageSize);

    int deleteStudentById(Integer id);
}
