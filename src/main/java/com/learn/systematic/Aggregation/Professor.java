package com.learn.systematic.Aggregation;

class Professor {
    public String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
