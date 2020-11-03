package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: CourseScore
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建课程得分类
public class CourseScore {
    @TableId(value = "score_id")
    private Integer Id;//序号
    @TableField(value = "student_id")
    private Integer studentId;//学员序号
    @TableField(value = "course_id")
    private Integer courseId;//课程序号
     @TableField(value = "score")
    private Integer score;//得分

    public CourseScore() {
    }

    public CourseScore(Integer id, Integer studentId, Integer courseId, Integer score) {
        Id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public Integer getScore() {
        return score;
    }
}
