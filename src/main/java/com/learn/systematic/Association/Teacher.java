package com.learn.systematic.Association;

import java.util.ArrayList;
import java.util.List;

class Teacher {
    private String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println(name + " teaches:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}
