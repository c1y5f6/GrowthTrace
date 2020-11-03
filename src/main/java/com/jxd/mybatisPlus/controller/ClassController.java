package com.jxd.mybatisPlus.controller;

import com.jxd.mybatisPlus.mapper.IClassMapper;
import com.jxd.mybatisPlus.model.Class;
import com.jxd.mybatisPlus.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/10/31 16:07
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */


@Controller
public class ClassController {

    @Autowired
    IClassService iClassService;

    //获取班级列表
    @RequestMapping("getClassList")
    @ResponseBody
    public List<Integer> getClassList(){
        List<Integer> list=new ArrayList<>();
        List<Class> list1 = iClassService.list();
        for (Class c :list1) {
            list.add(c.getId());
        }
        return  list;
    }
}
