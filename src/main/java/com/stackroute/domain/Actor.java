package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Actor {

    private String actor;
    private String gender;
    private int age;

    public Actor(String actor, String gender, int age) {
        this.actor = actor;
        this.gender = gender;
        this.age = age;
    }

    public Actor() {

    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor='" + actor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
