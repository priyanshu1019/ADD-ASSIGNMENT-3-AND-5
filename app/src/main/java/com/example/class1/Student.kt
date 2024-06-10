package com.example.class1;

public class Student {
    String name;
    String reg;
    int age;

    public Student(String name, String reg, int age) {
        this.name = name;
        this.reg = reg;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
