package com.github.dlweatherhead.todoplanner.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.github.dlweatherhead.todoplanner.models.Todo;

public interface TodoRepository extends ListCrudRepository<Todo, Long> {
    
}
