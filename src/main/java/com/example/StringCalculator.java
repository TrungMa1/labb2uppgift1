package com.example;

public class StringCalculator {

    public static void main(String[] args) {

        System.out.println(Add("5"));
        System.out.println(Add("7"));
        System.out.println(Add("3,8"));
    }

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String[] numberArray = numbers.split(",");
            int sum = 0;

            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }

            return sum;
        }
    }
}