package org.example;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else if (input.length() == 1) {
            return Integer.parseInt(input);
        }
        String[] inputArr = input.split("\n");
        int sum = 0;
        for (String str: inputArr) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
