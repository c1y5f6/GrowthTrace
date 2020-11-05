package com.jxd.mybatisPlus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.jxd.mybatisPlus.model.SchoolEvaluation;
import com.jxd.mybatisPlus.service.ISchoolEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/11/4
 * @author: Yan XiaoZhi
 */
@Controller
public class SchoolEvaluationController {
    @Autowired
    ISchoolEvaluationService iSchoolEvaluationService;

    @RequestMapping("/getHeaderById/{studentId}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id获取学校评价表的动态表头
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:49
     * @param studentId:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> getHeaderById(@PathVariable("studentId") Integer studentId){
        List<Map<String, Object>> scores = iSchoolEvaluationService.getScoreById(studentId);
        List<Map<String,Object>> myHeader = new ArrayList<>();
        int count = 1;
        for ( Map<String,Object> course: scores) {
            Map<String,Object> map = new HashMap<>();
            map.put("label",course.get("courseName"));
            map.put("prop","score"+count++);
            myHeader.add(map);
        }
        return myHeader;
    }

    @RequestMapping("/getScoreById/{studentId}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id获取学校评价表动态表头下的分数
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:50
     * @param studentId:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> getScoreById(@PathVariable("studentId") Integer studentId){
        List<Map<String, Object>> scores = iSchoolEvaluationService.getScoreById(studentId);
        List<Map<String,Object>> myScore = new ArrayList<>();
        int count = 1;
        Map<String,Object> map = new HashMap<>();
        for ( Map<String,Object> course: scores) {
            map.put("score"+count++,course.get("score"));
        }
        myScore.add(map);
        return myScore;
    }

    @RequestMapping("/getSchoolEvaluationId/{studentId}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id获取学校评价内容
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:50
     * @param studentId:
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     **/
    public Map<String, Object> getSchoolEvaluationId(@PathVariable("studentId") Integer studentId){
        QueryWrapper<SchoolEvaluation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_id",studentId);
        return iSchoolEvaluationService.getMap(queryWrapper);
    }
}
