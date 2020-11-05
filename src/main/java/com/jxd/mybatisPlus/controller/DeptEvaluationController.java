package com.jxd.mybatisPlus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.mybatisPlus.model.DeptEvaluation;
import com.jxd.mybatisPlus.service.IDeptEvaluationService;
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
public class DeptEvaluationController {
    @Autowired
    IDeptEvaluationService iDeptEvaluationService;

    @RequestMapping("/getDeptHeaderById/{studentId}/{year}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id和工作时间获取工作评价表的动态表头
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 10:42
     * @param studentId:
     * @param year:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> getDeptHeaderById(@PathVariable("studentId") Integer studentId, @PathVariable("year") Integer year){
        List<Map<String, Object>> scores = iDeptEvaluationService.getDeptScoreById(studentId, year);
        List<Map<String,Object>> myHeader = new ArrayList<>();
        int count = 1;
        for ( Map<String,Object> course: scores) {
            Map<String,Object> map = new HashMap<>();
            map.put("label",course.get("qualityName"));
            map.put("prop","score"+count++);
            myHeader.add(map);
        }
        return myHeader;
    }

    @RequestMapping("/getDeptScoreById/{studentId}/{year}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id和工作时间获取工作评价表动态表头下的分数
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 10:45
     * @param studentId:
     * @param year:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> getDeptScoreById(@PathVariable("studentId") Integer studentId,@PathVariable("year") Integer year){
        List<Map<String, Object>> scores = iDeptEvaluationService.getDeptScoreById(studentId, year);
        List<Map<String,Object>> myScore = new ArrayList<>();
        int count = 1;
        Map<String,Object> map = new HashMap<>();
        for ( Map<String,Object> course: scores) {
            map.put("score"+count++,course.get("score"));
        }
        myScore.add(map);
        return myScore;
    }

    @RequestMapping("/getDeptEvaluationId/{studentId}/{year}")
    @ResponseBody
    /**
     * @Descriptnio:根据学生id和工作时间获取工作评价内容
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 11:04
     * @param studentId:
     * @param year:
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     **/
    public Map<String, Object> getDeptEvaluationId(@PathVariable("studentId") Integer studentId,@PathVariable("year") Integer year){
        QueryWrapper<DeptEvaluation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_id",studentId).eq("period_no",year);
        return iDeptEvaluationService.getMap(queryWrapper);
    }
}
