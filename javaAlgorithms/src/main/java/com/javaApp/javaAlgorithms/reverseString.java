package com.javaApp.javaAlgorithms;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class reverseString {

    public static String reverseLetters(String str) {
        StringJoiner reversedString = new StringJoiner("");
        for (int i = str.length() - 1; i >= 0; i--)  {
            if (Character.isLetter(str.charAt(i))) {
                reversedString.add(String.valueOf(str.charAt(i)));
            }
        }
        return reversedString.toString();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        String normalString = "@123Helloworld@563";
        String reversedString = reverseLetters(normalString);

        System.out.println("The reversed string is: " + reversedString);


        List<Integer> list = Arrays.asList(4, 7, 3, 4, 9, 4, 3, 3, 3, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);

            if (map.containsKey(number)) {
                map.put(number, map.get(number) +1);
            } else {
                map.put(number, 1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count++;
            }
        }

        System.out.println("The number of same number pairs is: " + count);
    }}