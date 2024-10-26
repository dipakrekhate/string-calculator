package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;
    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }
//    "" -> 0
    @Test
    void addReturnZeroForEmptyInput() {
        String input = "";
        int expected = 0;
        Assertions.assertEquals(expected, stringCalculator.add(input));
    }
}
