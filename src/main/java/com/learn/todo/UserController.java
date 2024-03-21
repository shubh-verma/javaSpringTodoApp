package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
        @Autowired
//        private UserDaoService service;
        @GetMapping("/users")
        public List<User> getAllUsers()
        {
            return service.findAll();
        }
        //retrieves a specific user detail
        @GetMapping("/users/{id}")
        public User getUser(@PathVariable int id)
        {
            return service.findOne(id);
        }
        //method that posts a new user detail
        @PostMapping("/users")
        public void createUser(@RequestBody User user) {
            User sevedUser = service.save(user);
        }
}
