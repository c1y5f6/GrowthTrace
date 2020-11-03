package com.jxd.mybatisPlus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 谌勇峰
 * @Date: 2020/10/30
 * @Version: V1.0
 **/
//创建登录的用户类
public class User {
    @TableId(value = "user_id")
    private Integer Id;//序号
    @TableField(value = "student_name")
    private String uName;//用户姓名
    @TableField(value = "password")
    private String pwd;//用户密码
    @TableField(value = "role")
    private Integer role;//用户角色/权限：0管理员、1教师、2主管

    public User() {
    }

    public User(Integer id, String uName, String pwd, Integer role) {
        Id = id;
        this.uName = uName;
        this.pwd = pwd;
        this.role = role;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getId() {
        return Id;
    }

    public String getuName() {
        return uName;
    }

    public String getPwd() {
        return pwd;
    }

    public Integer getRole() {
        return role;
    }
}
