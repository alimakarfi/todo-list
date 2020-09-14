package com.example.todo;

import java.time.LocalDateTime;

public class TodoListResponseBody {
    private int number;
    private String name;
    private LocalDateTime dateCreated;

    public TodoListResponseBody(int number, String name, LocalDateTime dateCreated) {
        this.number = number;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
