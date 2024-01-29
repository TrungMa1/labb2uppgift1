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
    }

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",|\n";

            Pattern pattern = Pattern.compile("//(.)\n(.*)");
            Matcher matcher = pattern.matcher(numbers);

            if (matcher.matches()) {
                delimiter = matcher.group(1);
                numbers = matcher.group(2);
            }

            String[] numberArray = numbers.split(delimiter);

            int sum = 0;

            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }

            return sum;
        }
    }
}
