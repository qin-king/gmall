package com.atguigu.gamll.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.atguigu.gmall.ums.dao")
@RefreshScope
public class GamllUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllUmsApplication.class, args);
    }

}
