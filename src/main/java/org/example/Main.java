package org.example;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Exercise 1: The "New Way" - A Simple Lambda Expression
        Predicate<String> isLong = s -> s.length() > 10;

        String str1 = "short";
        String str2 = "This is a very long string";

        System.out.println("Is '" + str1 + "' long? " + isLong.test(str1));
        System.out.println("Is '" + str2 + "' long? " + isLong.test(str2));
    }
}