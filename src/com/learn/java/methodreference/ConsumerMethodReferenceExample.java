package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * classname::methodName
     */
    static Consumer<Student> studentConsumer = System.out::println;

    static Consumer<Student> studentActivityConsumer = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(studentActivityConsumer);
    }
}
