package com.atguigu.gamll.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.atguigu.gmall.oms.dao")
@RefreshScope
public class GamllOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllOmsApplication.class, args);
    }

}
