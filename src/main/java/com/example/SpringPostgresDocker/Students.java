package com.example.SpringPostgresDocker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    private int id;
    private String name;
    private int age;
    private String grade;

    public Students() {

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
