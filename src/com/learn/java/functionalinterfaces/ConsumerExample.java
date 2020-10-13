package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Consumer<Student> studentNameConsumer = (student) -> System.out.print(student.getName());
    static Consumer<Student> studentActivitiesConsumer = (student) -> System.out.println(student.getActivities());


    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("sandeep");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    public static void printName() {
        System.out.println("printName: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentNameConsumer.andThen(studentActivitiesConsumer)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if(student.getGradeLevel() >= 3)
                studentNameConsumer.andThen(studentActivitiesConsumer).accept(student);
        });

    }
}
