package com.learn.todo;

import jakarta.persistence.*;

@Entity
@Table(name = "CustomUser")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId;
  @Column
  private String userName;
  @Column

//    @JsonIgnore
  private String userPassword;

  public User() {
  }

  public User(String userName, String userPassword, Integer userId) {
    this.userName = userName;
    this.userPassword = userPassword;
    this.userId = userId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


//    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//    String result = encoder.encode("myPassword");
//    assertTrue(encoder.matches("myPassword", result));

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }
}
