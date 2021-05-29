package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    static List<String> namesAsList() {
        List<String> names = StudentDataBase.getAllStudents()
                .stream()// Stream<Student>
                .map(Student::getName) // Stream<String> Student as i/p -> Student name here it converts the type
                .map(String::toUpperCase) // no conversion here map performs an operation
                .collect(toList()); //List<String>
        return names;
    }

    static Set<String> namesAsSet() {
        Set<String> names = StudentDataBase.getAllStudents()
                .stream()// Stream<Student>
                .map(Student::getName) // Stream<String> Student as i/p -> Student name here it converts the type
                .map(String::toUpperCase) // no conversion here map performs an operation
                .collect(toSet()); //List<String>
        return names;
    }

    public static void main(String[] args) {
        System.out.println(namesAsList());
        System.out.println(namesAsSet());
    }
}
