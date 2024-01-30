package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static void main(String[] args) {
        System.out.println(Add(""));
        System.out.println(Add("5"));
        System.out.println(Add("1,2,3,4,5"));
        System.out.println(Add("1\n2\n3"));
        System.out.println(Add("//;\n1;2"));
        System.out.println(Add("2,1001"));
        System.out.println(Add("//[***]\n1***2***3"));

        try {
            System.out.println(Add("1,-2,3,-4"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",|\n";

            Pattern pattern = Pattern.compile("//(\\[.*?\\]|.)(?:\\n(.*))?");  // Updated regex
            Matcher matcher = pattern.matcher(numbers);

            if (matcher.matches()) {
                delimiter = Pattern.quote(matcher.group(1));
                numbers = matcher.group(2);
            }

            String[] numberArray = numbers.split(delimiter);

            int sum = 0;
            StringBuilder negativeNumbers = new StringBuilder();

            for (String num : numberArray) {
                try {
                    int parsedNum = Integer.parseInt(num);
                    if (parsedNum < 0) {
                        if (!negativeNumbers.isEmpty()) {
                            negativeNumbers.append(", ");
                        }
                        negativeNumbers.append(parsedNum);
                    } else if (parsedNum <= 1000) {
                        sum += parsedNum;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + num);
                }
            }

            if (!negativeNumbers.isEmpty()) {
                throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
            }

            return sum;
        }
    }
}
