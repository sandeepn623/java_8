package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatmapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .sorted()
                .distinct()
                .collect(toList());
        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
