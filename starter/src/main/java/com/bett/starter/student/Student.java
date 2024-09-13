package com.bett.starter.student;

public class Student {
    private Long id;
    private String name;
    private Long age;

    // Constructor
    public Student(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }
}

