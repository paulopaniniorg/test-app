package com.benify.springboottemplate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World from test-app test";
    }

    @GetMapping(path = "/bye")
    public String sayBye() {
        return "Bye from test-app";
    }
}