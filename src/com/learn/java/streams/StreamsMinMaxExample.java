package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> emptyList = Arrays.asList();
        System.out.println("max: " + findMax(integers));
        System.out.println("max: " + findMax(emptyList));
        printResult("max", findMaxUsingOptional(integers));
        printResult("max", findMaxUsingOptional(emptyList));
        System.out.println("min: " + findMin(integers));
        System.out.println("min: " + findMin(emptyList));
        printResult("min", findMinUsingOptional(integers));
        printResult("min", findMinUsingOptional(emptyList));
    }

    private static int findMax(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    private static Optional<Integer> findMaxUsingOptional(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a > b ? a : b);
    }

    private static int findMin(List<Integer> integers) {
        return integers.stream()
                .reduce(0, (a, b) -> a < b ? a : b);
    }

    private static Optional<Integer> findMinUsingOptional(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a < b ? a : b);
    }

    private static void printResult(String tag, Optional<Integer> result) {
        if(result.isPresent())
            System.out.println(tag + ": " + result.get());
        else
            System.out.println(tag + " is not available");
    }
}
