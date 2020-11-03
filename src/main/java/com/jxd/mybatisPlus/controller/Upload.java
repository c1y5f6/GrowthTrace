package com.jxd.mybatisPlus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/11/3 15:16
 * @description：TODO
 * @modified By：
 * @version: 1.0
 */

@Controller
public class Upload {

    @RequestMapping("/upload")
//    @CrossOrigin
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        // 文件存储位置，文件的目录要存在才行，可以先创建文件目录，然后进行存储
        String filePath = "E:\\file\\GrowthTrace_sys\\src\\main\\webapp\\upload";

        File file =new File(filePath);
        if(!file.exists()){
            file.mkdirs();
        }
        // 文件存储
        //上传文件项
        //获取上传文件的名称
        String filename = multipartFile.getOriginalFilename();
        System.out.println("filename:"+filename);
        //把文件名称设置唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename=uuid+"-"+filename;
        System.out.println("filename:"+filename);
        //完成上传文件
        File newFile= new File(filePath,filename);
        multipartFile.transferTo(newFile);
        // replaceAll 用来替换windows中的\\ 为 /
        System.out.println(filename);
        System.out.println(newFile.getAbsolutePath().replaceAll("\\\\", "/"));
        //返回文件名 前台通过固定地址+文件名的方法访问该图片 存储使用的是相对路径
        return filename;
    }

}
