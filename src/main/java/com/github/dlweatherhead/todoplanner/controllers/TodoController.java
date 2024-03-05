package com.github.dlweatherhead.todoplanner.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;
import com.github.dlweatherhead.todoplanner.services.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {
    
    final TodoService todoService;

    @PutMapping("/todos/{id}")
    public Todo updateTodoItem(@PathVariable("id") long id) {
        Todo updatedTodo = todoService.getById(id);

        StatusType newStatus = updatedTodo.getStatus().getNextStatus();
        updatedTodo.setStatus(newStatus);

        return todoService.save(updatedTodo);
    }
}
