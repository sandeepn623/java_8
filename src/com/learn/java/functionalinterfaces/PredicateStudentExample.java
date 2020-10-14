package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    Predicate<Student> studentGradePredicate = (student) -> student.getGradeLevel() >=3;

    Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >=3.9;

    public static void main(String[] args) {
        PredicateStudentExample instance = new PredicateStudentExample();
        instance.filterStudentsByGrade();
        instance.filterStudentsByGpa();
        instance.filterStudents();
    }

    public void filterStudentsByGrade() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("filterStudentsByGrade");
        students.forEach(student -> {
            if(studentGradePredicate.test(student)){
                System.out.println(student);
            }
        });
    }

    public void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if(studentGpaPredicate.test(student)){
                System.out.println(student);
            }
        });
    }

    public void filterStudents() {
        System.out.println("filterStudents");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if(studentGpaPredicate.or(studentGradePredicate).negate().test(student)){
                System.out.println(student);
            }
        });
    }
}
