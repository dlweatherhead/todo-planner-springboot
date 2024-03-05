package com.github.dlweatherhead.todoplanner.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;
import com.github.dlweatherhead.todoplanner.repositories.TodoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoService {
    final TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public List<Todo> getAllByStatus(StatusType statusType) {
        return todoRepository.findAllByStatus(statusType);
    }

    public Todo save(Todo newTodo) {
        if (newTodo.getId() == null) {
            newTodo.setCreatedAt(LocalDateTime.now());
        }

        newTodo.setUpdatedAt(LocalDateTime.now());

        return todoRepository.save(newTodo);
    }
}
