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
//    "1" -> 1
    @Test
    void addReturnResultForLengthOneInput() {
        String input = "1";
        int expected = 1;
        Assertions.assertEquals(expected, stringCalculator.add(input));
    }
//    "3\n4" -> 7
    @Test
    void addReturnResultForInputThatSeperatLine() {
        String input = "3\n4";
        int expected = 7;
        Assertions.assertEquals(expected, stringCalculator.add(input));
    }
}
