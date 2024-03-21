package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TodoController {
//    @Autowired
//    private TodoRepository todoRepository;
    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot!";
    }
    @GetMapping("/prime")
    public String hello(@RequestParam Integer number) {
        System.out.println(number);
        return CheckNumber.isPrime(number).toString();

    }
}
