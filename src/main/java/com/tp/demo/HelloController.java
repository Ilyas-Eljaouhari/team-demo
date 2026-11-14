package com.tp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Greetings, DevOps!";
    }

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam(defaultValue = "Hello world") String msg) {
        return msg;
}
}