package com.learn.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        names.remove(0);
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println);
    }
}
