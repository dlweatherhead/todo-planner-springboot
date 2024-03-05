package com.github.dlweatherhead.todoplanner.repositories;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;

public interface TodoRepository extends ListCrudRepository<Todo, Long> {
    List<Todo> findAllByStatus(StatusType statusType);
}
