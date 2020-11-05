package com.jxd.mybatisPlus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.mybatisPlus.mapper.ISchoolEvaluationMapper;
import com.jxd.mybatisPlus.model.SchoolEvaluation;
import com.jxd.mybatisPlus.service.ISchoolEvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/11/3
 * @author: Yan XiaoZhi
 */
@Service
public class SchoolEvaluationServiceImpl extends ServiceImpl<ISchoolEvaluationMapper, SchoolEvaluation> implements ISchoolEvaluationService {
    @Resource
    ISchoolEvaluationMapper iSchoolEvaluationMapper;


    public List<Map<String, Object>> getScoreById(Integer studentId){
        return iSchoolEvaluationMapper.getScoreById(studentId);
    }


}
