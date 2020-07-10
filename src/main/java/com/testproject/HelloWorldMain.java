package com.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 标注是Spring应用
 */
@SpringBootApplication
public class HelloWorldMain {
    public static void main(String[] args) {
        //让应用跑起来
        SpringApplication.run(HelloWorldMain.class,args);
    }
}
