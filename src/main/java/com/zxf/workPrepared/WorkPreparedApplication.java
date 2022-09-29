package com.zxf.workPrepared;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author zxf
 */
@ComponentScan(basePackages = {"com.zxf.workPrepared.service", "com.zxf.workPrepared.controller", "com.zxf.workPrepared.config"})
@MapperScan(basePackages = "com.zxf.workPrepared.mapper")
@SpringBootApplication
public class WorkPreparedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkPreparedApplication.class, args);
    }

}
