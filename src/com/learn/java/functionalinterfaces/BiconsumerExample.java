package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerExample {

    public static void main(String[] args) {
        BiConsumer<String,String> biconsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
        biconsumer.accept("Sandeep", "Nanjundaswamy");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Product of : " + a + " x " + b + " is :" + (a*b));
        BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println("Quotient of : " + a + " / " + b + " is :" + (a/b));
        multiply.andThen(divide).accept(10, 5);
        BiconsumerExample biconsumerExample = new BiconsumerExample();
        biconsumerExample.nameAndActivities();
    }

    public void nameAndActivities() {
        BiConsumer<String, List<String>> biconsumer = (name, activities) -> System.out.println(name + " : " + activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> biconsumer.accept(student.getName(), student.getActivities()));
    }
}
