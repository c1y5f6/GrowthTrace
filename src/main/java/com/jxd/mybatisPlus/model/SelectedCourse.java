package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName: SelectedCourse
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建教师要教授的课程类
    @TableName("course_selected")
public class SelectedCourse {
    @TableId(value = "select_id",type = IdType.AUTO)
    private Integer Id;//已选课程序号
    @TableField(value = "course_id")
    private Integer courseId;//课程id
    @TableField(value = "class_no")
    private Integer classid;

    public SelectedCourse() {
    }

    public SelectedCourse(Integer courseId, Integer classid) {
        this.courseId = courseId;
        this.classid = classid;
    }

    public SelectedCourse(Integer id, Integer courseId, Integer classid) {
        Id = id;
        this.courseId = courseId;
        this.classid = classid;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public Integer getClassid() {
        return classid;
    }
}
