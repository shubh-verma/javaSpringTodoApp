package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
  @Autowired
  UserRepository repo;
  @Autowired
  PasswordEncoder passwordEncoder;

  public List<User> getAllUsers() {
    List<User> users = new ArrayList<User>();
    repo.findAll().forEach(user -> users.add(user));
    return users;
  }

  public void createUser(User user) {
    String pass = user.getUserPassword();
    String hashPass = passwordEncoder.encode(pass);
    user.setUserPassword(hashPass);

    repo.save(user);

  }
//    getAllUsersWithPassword(){}

}
