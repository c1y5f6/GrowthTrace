package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: Class
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建班级类
public class Class {
    @TableId(value = "class_no")
    private Integer Id;//班级序号
    @TableField(value = "teacher_id")
    private Integer  teacherId;//教师id

    public Class() {
    }

    public Class(Integer id, Integer teacherId) {
        Id = id;
        this.teacherId = teacherId;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }
}
