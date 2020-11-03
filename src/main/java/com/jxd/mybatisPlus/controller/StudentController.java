package com.jxd.mybatisPlus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.mybatisPlus.model.Student;
import com.jxd.mybatisPlus.service.IStudentService;
import com.jxd.mybatisPlus.service.impl.IStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/1 13:32
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
//@CrossOrigin
@Controller
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    //获取学生信息列表 带模糊查询
    @RequestMapping("getStudentInfoByClass/{classNo}/{name}/{curPage}/{pageSize}")
    @ResponseBody
    public List<Map<String, Object>> getStudentInfoForAllTable(@PathVariable Integer classNo, @PathVariable String name, @PathVariable Integer curPage, @PathVariable Integer pageSize) {
        return iStudentService.getCourseByClass(classNo, name, curPage, pageSize);
    }

    //获取学生信息列表
    @RequestMapping("getStudentInfoByClass/{classNo}/{curPage}/{pageSize}")
    @ResponseBody
    public List<Map<String, Object>> getStudentInfoForAllTabl2e(@PathVariable Integer classNo, @PathVariable Integer curPage, @PathVariable Integer pageSize) {
        return iStudentService.getCourseByClass(classNo, "", curPage, pageSize);
    }

    //获取学生数量
    @RequestMapping("getStudentCountByClass/{classNo}")
    @ResponseBody
    public int getStuCountByClass(@PathVariable Integer classNo) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("isdeleted", 0);
        queryWrapper.eq("class_no", classNo);
        return iStudentService.count(queryWrapper);
    }

    //删除学生
    @RequestMapping("deleteStudentById/{id}")
    @ResponseBody
    public int deleteStudentById(@PathVariable Integer id) {
        return iStudentService.deleteStudentById(id);
    }

    //添加学生
    @RequestMapping("addStudent")
    @ResponseBody
    public boolean addStudent(Student student) {
        return iStudentService.save(student);
    }
}
