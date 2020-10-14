package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    private Predicate<Student> studentGradePredicate = student -> student.getGradeLevel() >=3;
    private Predicate<Student> studentGpaPredicate = student -> student.getGpa() >=3.9;

    private BiConsumer<String, List<String>> nameAndActivitiesBiConsumer
            = (name, activities) -> System.out.println("name: " + name + " activities: " + activities);
    private Consumer<Student> combinedStudentGpaAndGradeConsumer = student -> {
        if(studentGpaPredicate.and(studentGradePredicate).test(student)) {
            nameAndActivitiesBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {
        PredicateAndConsumerExample instance = new PredicateAndConsumerExample();
        instance.printNameAndActivities();
    }

    public void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("combinedStudentGpaAndGradeConsumer: ");
        studentList.forEach(this.combinedStudentGpaAndGradeConsumer);
    }
}
