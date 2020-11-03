package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName: Teacher
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/

//创建教师类
@TableName(value = "teacher")
public class Teacher {
    @TableId(value = "teacher_id", type = IdType.AUTO)
    private Integer Id;//教师序号
    @TableField(value = "teacher_name")
    private String tName;//教师姓名
    @TableField(value = "flag_deleted")
    private int isDeleted;//是否删除

    public Teacher() {
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Teacher(Integer id, String tName, int isDeleted) {
        Id = id;
        this.tName = tName;
        this.isDeleted = isDeleted;
    }

    public Teacher(Integer id, String tName) {
        Id = id;
        this.tName = tName;
    }


    public void setId(Integer id) {
        Id = id;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer getId() {
        return Id;
    }

    public String gettName() {
        return tName;
    }
}
