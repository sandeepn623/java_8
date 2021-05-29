package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsLimitSkipExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        System.out.println("sum using limit: " + getSumUsingLimit(integers, 3));
        System.out.println("sum using skip: " + getSumUsingSkip(integers, 2));
    }

    public static int getSumUsingLimit(List<Integer> integers, int limit) {
        return integers.stream()
                .limit(limit)
                .reduce(0, (a,b) -> a+b);
    }

    public static int getSumUsingSkip(List<Integer> integers, int skip) {
        return integers.stream()
                .skip(skip)
                .reduce(0, (a,b) -> a+b);
    }
}
