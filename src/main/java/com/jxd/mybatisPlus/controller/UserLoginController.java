package com.jxd.mybatisPlus.controller;


import com.jxd.mybatisPlus.model.UserLogin;
import com.jxd.mybatisPlus.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @date: 2020/10/30
 * @author: Yan XiaoZhi
 */
@Controller
public class UserLoginController {
    @Autowired
    IUserLoginService iUserLoginService;



    @RequestMapping("/getLogin")
    @ResponseBody
    /**
     * @Descriptnio:登录
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:51
     * @param userLogin:
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     **/
    public Map<String,Object> doLogin(@RequestBody UserLogin userLogin){
        UserLogin user = iUserLoginService.getLogin(userLogin);
        Map<String,Object> map = new HashMap<>();
        if (null != user){
            map.put("uName",user.getName());
            map.put("role",user.getRole());
        }
        return map;
    }



    @RequestMapping("/changePwd/{uId}/{pwd}")
    @ResponseBody
    /**
     * @Descriptnio:修改个人密码
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:51
     * @param uId:
     * @param pwd:
     * @return: java.lang.String
     **/
    public String changePwdById(@PathVariable("uId") String uId,@PathVariable("pwd") String pwd){
        UserLogin userLogin = new UserLogin();
        userLogin.setId(Integer.parseInt(uId));
        userLogin.setPwd(pwd);
        String msg = "修改失败";
        if (iUserLoginService.updateById(userLogin)){
            msg = "修改成功";
        }
        return msg;
    }

    @RequestMapping("/resetPwd/{thisId}/{role}")
    @ResponseBody
    /**
     * @Descriptnio:管理员重置其他人密码
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:52
     * @param thisId:
     * @param role:
     * @return: java.lang.String
     **/
    public String resetPwdById(@PathVariable("thisId") String thisId,@PathVariable("role") int role){
        UserLogin userLogin = new UserLogin();
        userLogin.setId(Integer.parseInt(thisId));
        userLogin.setRole(role);
        userLogin.setPwd("123");//密码重置为123
        String msg = "重置失败";
        if (iUserLoginService.updateById(userLogin)){
            msg = "重置成功";
        }
        return msg;
    }

    @RequestMapping("/getUserByRole/{curPage}/{pageSize}/{uName}/{role}")
    @ResponseBody
    /**
     * @Descriptnio:管理员根据权限分类遍历出其他用户列表
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:52
     * @param curPage:
     * @param pageSize:
     * @param name:
     * @param role:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String,Object>> getUserByRole(@PathVariable("curPage") String curPage,
                                                    @PathVariable("pageSize") String pageSize,
                                                    @PathVariable("uName") String name,
                                                    @PathVariable("role") int role){
        Integer counts = (Integer.parseInt(curPage)-1)*Integer.parseInt(pageSize);

        List<Map<String,Object>> resultValue = iUserLoginService.getUserByRole(counts,Integer.parseInt(pageSize),name,role);
        return resultValue;
    }

    @RequestMapping("/getAllUserByLike/{uName}/{role}")
    @ResponseBody
    /**
     * @Descriptnio:获取遍历到的总数量
     * @Author: Yan XiaoZhi
     * @Date: 2020/11/4 9:53
     * @param name:
     * @param role:
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String,Object>> getAllUserByLike(@PathVariable("uName") String name,@PathVariable("role") int role){
        List<Map<String,Object>> users = iUserLoginService.getAllUserByLike(name,role);
        return users;
    }
}
