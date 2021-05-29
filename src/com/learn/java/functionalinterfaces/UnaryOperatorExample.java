package com.learn.java.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (str) -> str.concat("default");

    public static void main(String[] args) {
        System.out.println("result: " + unaryOperator.apply("java8"));
    }
}
