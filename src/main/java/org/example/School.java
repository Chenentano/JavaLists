package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class School {

    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        System.out.println("List of Students in the School:");
        for (Student student : students) {
            System.out.println("Name: " + student.getFirstName() + " " +
                    student.getLastName() + ", Student ID: " + student.getStudentID());
        }

    }

    public void findStudentByID(int studentID) {
        int number = 1;
        for (Student student : students) {
            if (student.getStudentID() == number) {
                System.out.println("test");
            }
        }
    }


}
