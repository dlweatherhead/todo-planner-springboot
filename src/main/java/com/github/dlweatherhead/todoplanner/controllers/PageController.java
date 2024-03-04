package com.github.dlweatherhead.todoplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.dlweatherhead.todoplanner.services.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PageController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
