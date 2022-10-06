package com.example.testcigardle;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestBaicos {

    @Test
    void test() {
        var a = "a";
        assertEquals("a",a);
    }

}
