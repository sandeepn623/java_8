package com.learn.java.constructorreference;

import com.learn.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> s1 = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());

        System.out.println(s1.apply("Sandeep"));
    }
}
