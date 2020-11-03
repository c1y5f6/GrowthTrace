package com.jxd.mybatisPlus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：zhaowentao
 * @date ：Created in 2020/10/26 10:53
 * @description：
 * @modified By：
 * @version: $
 */

@SpringBootApplication
@MapperScan("com.jxd.mybatisPlus.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
