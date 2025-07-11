package com.library;

import com.library.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        WelcomeService service = context.getBean("welcomeService", WelcomeService.class);
        service.greet();
    }
}
