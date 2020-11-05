package com.jxd.mybatisPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.mybatisPlus.model.SchoolEvaluation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/11/4
 * @author: Yan XiaoZhi
 */
public interface ISchoolEvaluationMapper extends BaseMapper<SchoolEvaluation> {
    //    根据学生id查询该生课程及成绩
    List<Map<String,Object>> getScoreById(@Param("studentId") Integer studentId);
}
