package com.example.springmultipledatasource.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.example.springmultipledatasource.entity.Greeting;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
/**
 * @RestController
 * @Controller and @ResponseBody rolled together
 * */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    /*private final AtomicLong counter = new AtomicLong();*/

    /**
     * @RequestMapping
     * maps all HTTP operations by default, so additional method=GET/POST/PUT/etc is used to narrow this mapping
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }*/

    @RequestMapping("/greeting")
    public HttpEntity<Greeting> greeting(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        Greeting greeting = new Greeting(String.format(TEMPLATE, name));
        greeting.add(linkTo(methodOn(GreetingController.class).greeting(name)).withSelfRel());

        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
