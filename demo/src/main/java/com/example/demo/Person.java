package com.example.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.AssertTrue;


public class Person {
    private String name;
    private String surname;

    private Integer age;


    @TCKimlikNo
    private String tcKimlikNo;

    public Person(@Valid String name, String surname, Integer age, @Valid String tcKimlikNo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.tcKimlikNo = tcKimlikNo;
    }

    @AssertTrue
    public boolean isNameValid(){
        return name.length() < 255;
    }


    public void incrementAge(){
        age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
