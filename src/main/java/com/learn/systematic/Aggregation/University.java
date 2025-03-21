package com.learn.systematic.Aggregation;

import java.util.ArrayList;
import java.util.List;

class University {
    private String universityName;
    private List<Professor> professors;

    public University(String universityName) {
        this.universityName = universityName;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void showProfessors() {
        System.out.println("Professors at " + universityName + ":");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.name);
        }
    }
}
