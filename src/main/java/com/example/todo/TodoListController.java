package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Random;

@RestController
public class TodoListController {

    @PostMapping(value = "/todo-list")
    public TodoListResponseBody createTodoList(@RequestBody TodoList todoList) {
        int number = new Random().nextInt();
        LocalDateTime currentTime = LocalDateTime.now();

        return new TodoListResponseBody(number, todoList.getName(), currentTime);
    }

    @DeleteMapping(value = "/todo-list/{todo-list-Id}")
    public String deleteTodoList(@PathVariable("todo-list-Id") String todoListId) {
        return "Deleted todo list with id " + todoListId;
    }
}
