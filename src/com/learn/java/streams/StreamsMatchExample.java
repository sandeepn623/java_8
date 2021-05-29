package com.learn.java.streams;

import com.learn.java.data.StudentDataBase;

public class StreamsMatchExample {

    public static void main(String[] args) {
        System.out.println("result of allMatch: " + allMatch());
        System.out.println("result of anyMatch: " + anyMatch());
        System.out.println("result of noneMatch: " + noneMatch());
    }

    private static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    private static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    private static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0);
    }
}
