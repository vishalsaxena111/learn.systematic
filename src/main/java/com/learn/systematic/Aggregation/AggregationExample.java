package com.learn.systematic.Aggregation;

public class AggregationExample {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith", "Computer Science");
        Professor prof2 = new Professor("Dr. Johnson", "Mathematics");

        University university = new University("Harvard University");
        university.addProfessor(prof1);
        university.addProfessor(prof2);

        university.showProfessors();

        // Professors can exist independently
        prof1.teach();
        prof2.teach();
    }
}
