package com.arc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 安全框架 启动类
 *
 * @author lamy
 */
@RestController
@SpringBootApplication
public class OathApplication {

    public static void main(String[] args) {
        SpringApplication.run(OathApplication.class, args);
    }

    /**
     * 测试
     *
     * @return Object
     */
    @GetMapping("/test/info")
    public Object arcLogin() {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        return LocalDateTime.now();
    }

}
