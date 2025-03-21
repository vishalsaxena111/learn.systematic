package com.learn.systematic.Association;

public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith");
        Teacher teacher2 = new Teacher("Mrs. Johnson");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student2);

        teacher1.showStudents();
        teacher2.showStudents();
    }
}
