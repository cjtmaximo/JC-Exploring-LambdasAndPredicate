package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    // A helper method to print the results of our filtering
    public static void filterAndPrint(List<String> list, Predicate<String> predicate, String description) {
        System.out.println("--- " + description + " ---");
        for (String item : list) {
            // Use the predicate's test method to filter
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }
        System.out.println(); // Add a blank line for readability
    }

    public static void main(String[] args) {
        // Exercise 1: The "New Way" - A Simple Lambda Expression
//        Predicate<String> isLong = s -> s.length() > 10;
//
//        String str1 = "short";
//        String str2 = "This is a very long string";
//
//        System.out.println("Is '" + str1 + "' long? " + isLong.test(str1));
//        System.out.println("Is '" + str2 + "' long? " + isLong.test(str2));

        // Exercise 2: Using Predicates to Filter a List
        List<String> callSigns = new ArrayList<>();
        callSigns.add("Alpha");
        callSigns.add("Bravo");
        callSigns.add("Archangel");
        callSigns.add("Echo");
        callSigns.add("Avenger");

        // Define a predicate with a lambda to find call signs starting with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        // Pass the list and the predicate (the behavior) to our method
        filterAndPrint(callSigns, startsWithA, "Call signs starting with 'A'");
    }
}