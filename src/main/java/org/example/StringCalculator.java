package org.example;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else if (input.length() == 1) {
            return Integer.parseInt(input);
        }
        String delimeter = null;
        if (input.matches("//(.*)\n(.*)")) {
            delimeter = Character.toString(input.charAt(2));
            input = input.substring(4);
        }
        String arr[] = input.split(delimeter + "|\n");
        return sum(arr);
    }
    private int sum(String[] arr) {
        int total = 0;
        for (String num : arr) {
            int value = Integer.parseInt(num);
            if (value < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed: " + value);
            }
            total += value;
        }
        return total;
    }
}
