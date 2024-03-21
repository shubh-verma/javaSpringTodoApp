package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repo;
    createUser(){
        User user = new User();
        user.setUserName(User.getUserName());
        user.setUserPassword(User.getUserPassword());

        return repository.save(user);
    }
    getAllUsers(){}
    getAllUsersWithPassword(){}

}
