package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

    public void sayHello() {
        System.out.println("Hello from Demo1Application!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Application is running1";
    }

    public String getA() {
        return "A";
    }
}
