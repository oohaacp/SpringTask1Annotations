package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    @Value("Suresh")
    private String name;
    @Value("Male")
    private String gender;
    @Value("35")
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}