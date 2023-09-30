package com.example.extra;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.group.equals(student.group) && this.name.equals(student.name) && this.surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        return surname + " " + name;
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
