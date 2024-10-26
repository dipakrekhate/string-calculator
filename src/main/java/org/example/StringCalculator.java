package org.example;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else if (input.length() == 1) {
            return Integer.parseInt(input);
        } else {
            throw new IllegalArgumentException("input not valid");
        }
    }
}
