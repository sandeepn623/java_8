package com.learn.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("adam", "dan", "julie");
        names.forEach(System.out::println);
        Stream.iterate(1, x->x*2)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> randomNumber = new Random()::nextInt;
        Stream.generate(randomNumber)
                .limit(5)
                .forEach(System.out::println);
    }
}
