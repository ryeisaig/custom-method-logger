package com.ryeisaig.customlogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ryeisaig.customlogger.service.TestService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CustomMethodLoggerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CustomMethodLoggerApplication.class, args);
        TestService service = context.getBean(TestService.class);
        service.testLog("Rye", "Philippines");
        service.testLogNoReturn("Rye", "Philippines");
    }
}