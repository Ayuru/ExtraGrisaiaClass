package com.example.extra;

public class Student {
    String name;
    String surname;
    char sex;
    String group;

    public Student(String name, String surname, char sex, String group) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public String getGroup() {
        return group;
    }
}
