package com.learn.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("name: " + function.apply("java8"));
        System.out.println("name and then: " + function.andThen(addSomeString).apply("java8"));
        System.out.println("name addSomeString: " + addSomeString.apply("java8"));
        System.out.println("name compose: " + function.compose(addSomeString).apply("java8"));
        String result = FunctionExample1.performConcat("hello");
        System.out.println("result: " + result);
    }

    static class FunctionExample1 {
        static String performConcat(String str){
            return FunctionExample.addSomeString.apply(str);
        }

    }
}
