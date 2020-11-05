package com.jxd.mybatisPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.mybatisPlus.model.UserLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/10/30
 * @author: Yan XiaoZhi
 */
public interface IUserLoginMapper extends BaseMapper<UserLogin> {
//    登录
    UserLogin getLogin(UserLogin userLogin);
    //    获取分页列表
    List<Map<String,Object>> getUserByRole(@Param("counts") Integer counts, @Param("pageSize") Integer pageSize, @Param("name") String name, @Param("role") int role);
    //获取全部列表
    List<Map<String,Object>> getAllUserByLike(@Param("name") String name, @Param("role") int role);
}
