package com.jxd.mybatisPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.mybatisPlus.model.DeptEvaluation;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/2 11:25
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */

@Repository
public interface IEvaluationDeptMapper extends BaseMapper<DeptEvaluation> {
    List<Map<String,Object>> getCourseScore(List<Integer> list);
}
