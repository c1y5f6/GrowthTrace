package com.jxd.mybatisPlus.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.mybatisPlus.Application;
import com.jxd.mybatisPlus.mapper.ITeacherMapper;
import com.jxd.mybatisPlus.model.Teacher;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/10/30 17:40
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {
    @Autowired
    ITeacherMapper iTeacherMapper;

    @org.junit.Test
    public void getTeacherList(){
        int curPage = 1;
        int pageSize = 5;
        List<Map<String,Object>> list ;
        int startIndex = (curPage-1)*pageSize;
        list = iTeacherMapper.getAllTeacher2(startIndex,pageSize);
        System.out.println(list);;
    }
}
