package com.jxd.mybatisPlus.controller;

import com.jxd.mybatisPlus.model.Emp;
import com.jxd.mybatisPlus.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/10/29 15:05
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */
@CrossOrigin
@Controller
public class EmpController {
    @Autowired
    IEmpService iEmpService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String str = "test";
        List<Emp> list= iEmpService.list();
        return str;
    }
}
