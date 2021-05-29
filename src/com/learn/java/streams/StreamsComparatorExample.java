package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    static List<Student> sortStudentsByGpaDescending() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by Gpa");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by Gpa reversed");
        sortStudentsByGpaDescending().forEach(System.out::println);
    }
}
