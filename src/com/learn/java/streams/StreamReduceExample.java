package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        int result = performMultiplication(integers);
        System.out.println(result);
        Optional<Integer> product = performMultiplicationWithoutIdentity(integers);
        if(product.isPresent())
            System.out.println(product.get());
        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        if(highestGPAStudent.isPresent())
            System.out.println(highestGPAStudent);
    }

    public static int performMultiplication(List<Integer> integers) {
        return integers.stream()
                .reduce(1, (a,b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
        return integers.stream()
                .reduce((a,b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }
}
