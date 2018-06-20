package com.riven_chris.method_references;

import java.util.function.Supplier;

public class User {

    private String name;
    private Integer age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void printUser(){

    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static User create(Supplier<User> userSupplier) {
        return userSupplier.get();
    }

    public static int compareStaticAge(User a, User b) {
        return Integer.compare(a.age, b.age);
    }

    public int compareNoStaticAge2(User a) {
        return Integer.compare(age, a.age);
    }

    public int compareNoStaticAge3(User a, User b) {
        return Integer.compare(a.age, b.age);
    }

    public void searchJob(SearchJob search) {
        Job job = search.searchJob();
    }

    public void selectJob(Job job) {

    }
}
