package com.jxd.mybatisPlus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.mybatisPlus.model.Teacher;
import com.jxd.mybatisPlus.service.ITeacherService;
import com.jxd.mybatisPlus.service.impl.ITeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/10/30 10:40
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
//@CrossOrigin
@Controller
public class TeacherController {
    @Autowired
    ITeacherServiceImpl iTeacherService;
    //获取教师列表
    @RequestMapping("/teacherList/{curPage}/{pageSize}")
    @ResponseBody
    public List<Map<String,Object>> getAllTeacher(@PathVariable Integer curPage,@PathVariable Integer pageSize){
        List<Teacher> list ;
        list=iTeacherService.getTeacherListForPage(curPage,pageSize);
        List<Map<String,Object>> list1 =new ArrayList<>();
        for (Teacher teacher:list) {
            Map<String,Object> map = new HashMap<>();
            map.put("id",teacher.getId());
            map.put("name",teacher.gettName());
            list1.add(map);
        }
        return list1;
    }
    //获取教师数量（给列表做分页使用）
    @RequestMapping("/teacherCount")
    @ResponseBody
    public int getTeacherCount(){
        List<Teacher> list ;
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("flag_deleted",0);
        list=iTeacherService.list(queryWrapper);
        int count = list.size();
        return count;
    }

    //教师信息修改(改名字）
    @RequestMapping("/updateTeacher/{id}/{tName}")
    @ResponseBody
    public int updateTeacher(Teacher teacher){
        int flag = 0;
        if(iTeacherService.updateById(teacher)){
            flag = 1;
        }
        return flag;
    }

    //删除教师
    @RequestMapping("/deleteTeacher/{id}/{isDeleted}")
    @ResponseBody
    public int deleteTeacher(Teacher teacher){
        int flag = 0;
        if(iTeacherService.updateById(teacher)){
            flag = 1;
        }
        return flag;
    }
    //添加教师

    @RequestMapping("/addTeacher/{tName}/{isDeleted}")
    @ResponseBody
    public int addTeacher(Teacher teacher){
        int flag = 0;
        if(iTeacherService.save(teacher)){
            flag = 1;
        }
        return flag;
    }
}


