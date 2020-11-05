package com.jxd.mybatisPlus.controller;


import com.jxd.mybatisPlus.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/11/2
 * @author: Yan XiaoZhi
 */
@Controller
public class MenuController {
    @Autowired
    IMenuService iMenuService;

    @RequestMapping("/getMenu/{role}")
    @ResponseBody
    /**
     * @Descriptnio:根据权限获取动态侧边栏
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:51
     * @param role:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> getAllDeptByLike(@PathVariable("role") String role) {
        List<Map<String, Object>> menu = iMenuService.queryMenuInfo(role);
        return menu;
    }
}
