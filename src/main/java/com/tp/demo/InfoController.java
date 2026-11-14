package com.tp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private static final String APP_NAME = "demo";
    private static final String APP_VERSION = "1.0.0";

    @GetMapping("/info")
    public String info() {
        return APP_NAME + " " + APP_VERSION;
    }
}
