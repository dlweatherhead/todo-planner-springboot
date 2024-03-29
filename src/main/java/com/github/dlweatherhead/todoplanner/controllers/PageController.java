package com.github.dlweatherhead.todoplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.dlweatherhead.todoplanner.models.StatusType;
import com.github.dlweatherhead.todoplanner.models.Todo;
import com.github.dlweatherhead.todoplanner.services.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PageController {
    final TodoService todoService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
 
        modelAndView.addObject("newTodo", new Todo());
        modelAndView.addObject("backlog", todoService.getAllByStatus(StatusType.BACKLOG));
        modelAndView.addObject("doing", todoService.getAllByStatus(StatusType.DOING));
        modelAndView.addObject("done", todoService.getAllByStatus(StatusType.DONE));

        return modelAndView;
    }
}
