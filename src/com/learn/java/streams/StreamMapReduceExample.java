package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMapReduceExample {

    public static void main(String[] args) {
        System.out.println("numberOFNoteBooks:" + numberOfNoteBooks());
    }

    private static int numberOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3 && student.getGender().equals("female"))
                //.filter(student -> student.getGpa() >= 3.9)
                .map(Student::getNoteBooks)
                //.reduce(0, (notebooks1, notebooks2) -> notebooks1 + notebooks2);
                .reduce(0, Integer::sum);
    }
}
