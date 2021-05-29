package com.learn.java.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCase = s -> s.toUpperCase();
    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("toUpperCase lambda: " + toUpperCase.apply("java8"));
        System.out.println("toUpperCase method reference: " + toUpperCaseMethodReference.apply("java8"));
    }
}
