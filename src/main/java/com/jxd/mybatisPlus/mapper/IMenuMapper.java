package com.jxd.mybatisPlus.mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/10/30
 * @author: Yan XiaoZhi
 */
public interface IMenuMapper {
    List<Map<String, Object>> queryAllMenu(String role);
}
