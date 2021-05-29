package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> studentGradePredicate = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() >=3;
    }
    public static void main(String[] args) {
        System.out.println(studentGradePredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
