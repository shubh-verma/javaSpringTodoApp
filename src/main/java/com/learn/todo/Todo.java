package com.learn.todo;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @Column
    private String todoTitle;
    @Column
    private Date dueDate;
    @Column
    private String taskStatus;
    public Todo(){

    }

    public Todo(Integer userId, String todoTitle, Date dueDate, String taskStatus) {
        this.userId = userId;
        this.todoTitle = todoTitle;
        this.dueDate = dueDate;
        this.taskStatus = taskStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
