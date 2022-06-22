package com.example.imperial_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialTest {

    Imperial imperial = new Imperial();

    @Test
    void ounceToGramTest() {
        // Arrage
        double a = 1;

        double expected = 28.35;

        // Act
        double result = imperial.ounceToGram(a);

        // Assert
        assertEquals(expected, result);
    }
}