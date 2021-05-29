package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
