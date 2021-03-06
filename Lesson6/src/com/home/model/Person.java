package com.home.model;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String sex;
    private Adress adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Person(String name, int age, String sex, Adress adress) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }
}
