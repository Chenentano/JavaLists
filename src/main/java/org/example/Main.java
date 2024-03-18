package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Hans", "Sarpei", 0));
        students.add(new Student("Franz", "Goooo", 1));
        students.add(new Student("Reiner", "Stan", 2));

        School school = new School();
        school.addStudent(new Student("James", "Klong", 0));
        school.addStudent(new Student("Jamess", "Klong", 1));
        school.addStudent(new Student("Jamesss", "Klong", 2));

        //school.printAllStudents();

        // Call findStudentByID method

        school.findStudentByID(0);
        school.removeStudent(2);
        school.findStudentByID(1);
        school.findStudentByID(2);
        school.findStudentByID(3);



    }
}