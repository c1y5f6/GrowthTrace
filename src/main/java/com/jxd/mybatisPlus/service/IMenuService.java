package com.jxd.mybatisPlus.service;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/10/30
 * @author: Yan XiaoZhi
 */
public interface IMenuService {
    List<Map<String, Object>> queryMenuInfo(String role);
    List<Map<String, Object>> getChild(String id, List<Map<String, Object>> allMenu);
}
