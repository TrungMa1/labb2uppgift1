package com.example;

public class StringCalculator {

    public static void main(String[] args) {

        System.out.println(Add(""));
        System.out.println(Add("5"));
        System.out.println(Add("1,2,3,4,5"));
        System.out.println(Add("1\n2\n3"));
    }

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String[] numberArray = numbers.split("[,\n]");
            int sum = 0;

            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }

            return sum;
        }
    }
}