package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        System.out.println("List of Students in the School:");
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " +
                    student.lastName + ", Student ID: " + student.StudentID);
        }
    }

    public void findStudentByID(int studentID) {
        for (Student student : students) {
            if (student.StudentID == studentID) {
                System.out.println("Gefundener Student: " + student.firstName + " " + student.lastName);
                return;
            }
        }
        System.out.println("Student mit der ID " + studentID + " wurde nicht gefunden.");
    }

    public void removeStudent(int studentID) {
        for (Student student : students) {
            if (student.StudentID == studentID) {
                students.remove(student);
                return;
            }
        }
        System.out.println("Student mit der ID " + studentID + " wurde nicht gefunden.");
    }

    }

