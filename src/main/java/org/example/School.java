package org.example;

import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<Student, String> students;

    public School(Map<Student, String> students) {
        this.students = students;
    }

    public void addStudent(Student student, String grade) {
        students.put(student, grade);
    }

    public void removeStudent(int id) {
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            if (entry.getKey().StudentID == id) {
                students.remove(entry.getKey());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void findStudentByID(int id) {
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            if (entry.getKey().StudentID == id) {
                System.out.println("Student found: " + entry.getKey().firstName + " " + entry.getKey().lastName + ", Grade: " + entry.getValue());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void printAllStudents() {
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            System.out.println(entry.getKey().firstName + " " + entry.getKey().lastName + ", Grade: " + entry.getValue());
        }
    }
}