package com.jxd.mybatisPlus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.mybatisPlus.model.SchoolEvaluation;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/11/3
 * @author: Yan XiaoZhi
 */
public interface ISchoolEvaluationService extends IService<SchoolEvaluation> {
    List<Map<String, Object>> getScoreById(Integer studentId);
}
