package com.jxd.mybatisPlus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.mybatisPlus.mapper.ICourseMapper;
import com.jxd.mybatisPlus.mapper.ICourseScoreMapper;
import com.jxd.mybatisPlus.mapper.IStudentMapper;
import com.jxd.mybatisPlus.model.Student;
import com.jxd.mybatisPlus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/1 13:31
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */

@Service
public class IStudentServiceImpl extends ServiceImpl<IStudentMapper, Student> implements IStudentService {

    @Autowired
    IStudentMapper iStudentMapper;

    @Autowired
    ICourseMapper iCourseMapper;


    //获取总表
    @Override
    public List<Map<String, Object>> getCourseByClass(int classNo,String name,Integer curPage,Integer pageSize) {
        List<Integer> selectedCoruse = iCourseMapper.getSelectedCourseByClassNo(classNo);
        Integer startIndex = (curPage-1)*pageSize;
        List<Map<String, Object>> list =iStudentMapper.getStudentInfoListByClassNo2(classNo,selectedCoruse,Arrays.asList(0,1,2,3),name,startIndex,pageSize);
        return list;
    }
    //删除学生 假删
    public int deleteStudentById(Integer id){
        return iStudentMapper.deleteStudentById(id);
    }
}
