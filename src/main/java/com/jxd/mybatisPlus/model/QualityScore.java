package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: QualityScore
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
public class QualityScore {
    @TableId(value = "score_id")
    private Integer Id;//序号
    @TableField(value = "quality_id")
    private Integer qualityId;//品质序号
    @TableField(value = "student_id")
    private Integer studentId;//学生序号
    @TableField(value = "score")
    private Integer score;//得分

    public QualityScore() {
    }

    public QualityScore(Integer id, Integer qualityId, Integer studentId, Integer score) {
        Id = id;
        this.qualityId = qualityId;
        this.studentId = studentId;
        this.score = score;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getQualityId() {
        return qualityId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getScore() {
        return score;
    }
}
