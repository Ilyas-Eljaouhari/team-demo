package com.tp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHello() {
        assertEquals("Greetings, DevOps!", controller.hello());
    }

    @Test
    void testVersion() {
        assertEquals("1.0.0", controller.version());
    }
}