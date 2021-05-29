package com.learn.java.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        System.out.println("result a*b: " + binaryOperator.apply(2, 3));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("max: " + maxBy.apply(4, 12));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("min: " + minBy.apply(2, 5));
    }
}
