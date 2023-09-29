package com.example.extra;

import java.util.ArrayList;

public class ListOperations {

    private ArrayList<ExtendedStudent> students = new ArrayList<>();

    public ArrayList<ExtendedStudent> create() {

        students.add(new ExtendedStudent("Tohka", "Shishigaya", 'f', "2a", "sniper", "rifle", 45));
        students.add(new ExtendedStudent("Rena", "Fukami", 'f', "2a", "gunman", "pistol", 372));
        students.add(new ExtendedStudent("Murasaki", "Ikoma", 'f', "2a", "ninja", "automatic pistol", 39));
        students.add(new ExtendedStudent("Christina Sakurako", "Kujirase", 'f', "2a", "agent", "explosives", 0));
        students.add(new ExtendedStudent("Haruto", "Aoi", 'm', "3a", "handler", "katana", 102));
        students.add(new ExtendedStudent("Yuuki", "Ikoma", 'f', "3a", "ninja", "pistol", 216));





        return students;
    }

    public void printBySexAndGroup(ArrayList<ExtendedStudent> students, char sex, String group) {

        int i = 0;
        System.out.println("List of filtered students:");

        for (ExtendedStudent student: students) {
            if(student.getSex() == sex && student.getGroup().equals(group)) {
            System.out.println(student.getSurname() + " " + student.getName());
            i++;
            }

        }

        if (i == 0) {
            System.out.println("Nothing to display.");
        }

    }



}
