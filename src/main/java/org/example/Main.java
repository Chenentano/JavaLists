package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Student,String> students = new HashMap<>();
        students.put(new Student("Hans", "Sarpei", 0), "Grade A");
        students.put(new Student("Franz", "Goooo", 1), "Grade B");
        students.put(new Student("Reiner", "Stan", 2), "Grade C");

        School school = new School(students);
        school.addStudent(new Student("James", "Klong", 3), "Grade D");
        school.addStudent(new Student("Jamess", "Klong", 4), "Grade F");

        school.printAllStudents();

        // Call findStudentByID method

        school.findStudentByID(0);
        school.removeStudent(2);
        school.findStudentByID(1);
        school.findStudentByID(2);
        school.findStudentByID(3);
    }
}
