package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: Dept
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建部门表
public class Dept {
    @TableId(value = "dept_no")
    private Integer Id;//部门序号
    @TableField(value = "dept_name")
    private String dName;//部门名称

    public Dept() {
    }

    public Dept(Integer id, String dName) {
        Id = id;
        this.dName = dName;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Integer getId() {
        return Id;
    }

    public String getdName() {
        return dName;
    }
}
