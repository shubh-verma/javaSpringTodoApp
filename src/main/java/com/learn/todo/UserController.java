package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
  @Autowired
  private UserService service;

  //    private UserRepository userRepository;
  @GetMapping("/users")
  public List<User> getAllUsers() {
    return service.getAllUsers();
  }

  @PostMapping("/user")
  public void createUser(@RequestBody User user) {
    service.createUser(user);
  }
}
