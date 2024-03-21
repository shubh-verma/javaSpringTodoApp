package com.learn.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        repo.findAll().forEach(user -> users.add(user));
        return users;
    }
    public void createUser(User user){
        repo.save(user);
    }
//    getAllUsersWithPassword(){}

}
