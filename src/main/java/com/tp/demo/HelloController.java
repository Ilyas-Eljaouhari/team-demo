
package com.tp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

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

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/echo")
    public String echo(@RequestParam(defaultValue = "Hello world") String msg) {
        return msg;
    }
}

