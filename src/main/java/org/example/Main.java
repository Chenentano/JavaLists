package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        List<Student> student = new ArrayList<>();
        student.add(new Student("Hans", "Sarpei", 0));
        student.add(new Student("Franz", "Goooo", 1));
        student.add(new Student("Reiner", "Stan", 2));

        System.out.println();

        School school = new School();
        school.addStudent(new Student("Test", "Test", 0));

        //school.printAllStudents();

        school.findStudentByID(0);

    }




}