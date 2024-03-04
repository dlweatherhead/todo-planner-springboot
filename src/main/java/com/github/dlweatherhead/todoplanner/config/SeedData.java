package com.github.dlweatherhead.todoplanner.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;
import com.github.dlweatherhead.todoplanner.services.TodoService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SeedData implements CommandLineRunner {
    final TodoService todoService;

    @Override
    public void run(String... args) throws Exception {
        List<Todo> todos = todoService.getAll();

        if(todos.isEmpty()) {
            Todo todo1 = Todo.builder().description("Create project").status(StatusType.DONE).build();
            Todo todo2 = Todo.builder().description("Implement todo feature").status(StatusType.DOING).build();
            Todo todo3 = Todo.builder().description("Deploy project").status(StatusType.BACKLOG).build();

            todoService.save(todo1);
            todoService.save(todo2);
            todoService.save(todo3);
        }
    }

}
