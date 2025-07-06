package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("🌀 Initializing Spring IoC Container...");

        // IoC: Spring takes control of object creation
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("✅ Spring context loaded. Fetching 'bookService' bean...");

        // DI: Spring injects BookRepository into BookService
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("📦 BookService bean received. Calling showBooks():");

        // Business logic execution
        bookService.showBooks();

        System.out.println("✅ Operation completed using Spring Dependency Injection.");
    }
}
