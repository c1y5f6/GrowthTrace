package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: Manager
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建主管类
public class Manager {
    @TableId(value = "manager_id")
    private Integer Id;//序号
    @TableField(value = "manager_name")
    private String mName;//主管姓名
    @TableField(value = "dept_no")
    private Integer deptId;//部门序号

    public Manager() {
    }

    public Manager(Integer id, String mName, Integer deptId) {
        Id = id;
        this.mName = mName;
        this.deptId = deptId;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getId() {
        return Id;
    }

    public String getmName() {
        return mName;
    }

    public Integer getDeptId() {
        return deptId;
    }
}
