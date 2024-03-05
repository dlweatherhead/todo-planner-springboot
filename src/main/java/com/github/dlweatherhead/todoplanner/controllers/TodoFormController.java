package com.github.dlweatherhead.todoplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;
import com.github.dlweatherhead.todoplanner.services.TodoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoFormController {
    final TodoService todoService;

    @PostMapping("/todos/new")
    public String createTodo(@Valid Todo newTodo) {
        newTodo.setStatus(StatusType.BACKLOG);
        
        todoService.save(newTodo);

        return "redirect:/";
    }
}
