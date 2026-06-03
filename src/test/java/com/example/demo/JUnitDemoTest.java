package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JUnitDemoTest {

    @Test
    void egalite() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void vraiFaux() {
        assertTrue(5 > 3);
        assertFalse(2 > 10);
    }

    @Test
    void exception() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });
    }
}