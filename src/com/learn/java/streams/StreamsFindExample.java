package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {

    public static void main(String[] args) {
        Optional<Student> findAnyStudentResult = findAnyStudent();
        printResult(findAnyStudentResult);
        Optional<Student> findFirstStudentResult = findFirstStudent();
        printResult(findFirstStudentResult);
    }

    private static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.9)
                .findAny();
    }

    private static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.9)
                .findAny();
    }

    private static void printResult(Optional<Student> student) {
        if(student.isPresent()) {
            System.out.println(student.get().getName());
        } else {
            System.out.println("Student not found");
        }
    }
 }
