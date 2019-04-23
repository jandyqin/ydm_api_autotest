package com.ydm.api_autotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
//启用缓存
@EnableCaching
//启用异步
@EnableAsync
//定时任务
@EnableScheduling
public class ApiAutotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiAutotestApplication.class, args);
    }

}
