package com.tp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfoControllerTest {

    @Test
    void infoReturnsNameAndVersion() {
        assertEquals("demo 1.0.0", new InfoController().info());
    }
}
