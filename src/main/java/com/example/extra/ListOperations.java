package com.example.extra;

import java.util.ArrayList;

public class ListOperations {


    public ArrayList<ExtendedStudent> create() {

        ArrayList<ExtendedStudent> students = new ArrayList<>();

        students.add(new ExtendedStudent("Tohka", "Shishigaya", 'f', "2a", "sniper", "rifle", 45));
        students.add(new ExtendedStudent("Rena", "Fukami", 'f', "2a", "gunman", "pistols", 372));
        students.add(new ExtendedStudent("Murasaki", "Ikoma", 'f', "2a", "ninja", "automatic pistol", 39));
        students.add(new ExtendedStudent("Christina Sakurako", "Kujirase", 'f', "2a", "agent", "technology", 2));
        students.add(new ExtendedStudent("Haruto", "Aoi", 'm', "3a", "handler", "katana", 102));
        students.add(new ExtendedStudent("Yuuki", "Ikoma", 'f', "3a", "ninja", "pistol", 216));
        students.add(new ExtendedStudent("Yuuji", "Kazami", 'm', "4a", "ace", "none", 789));
        students.add(new ExtendedStudent("Chiara", "Farrell", 'f', "4a", "assistant", "information", 0));
        students.add(new ExtendedStudent("Ayame", "Sengoku", 'm', "4b", "handler", "pistol", 21));
        students.add(new ExtendedStudent("Chihiro", "Ukawa", 'm', "4b", "handler", "rifle", 315));
        students.add(new ExtendedStudent("Izumi", "Yamamoto", 'f', "4a", "gunsmith", "none", 0));
        students.add(new ExtendedStudent("Kuroe", "Samejima", 'f', "4b", "gone rogue", "pistols", 414));

        return students;
    }

    public void printBySexAndGroup(ArrayList<ExtendedStudent> students, char sex, String group) {

        int i = 0;
        System.out.println("List of filtered students:");

        for (ExtendedStudent student : students) {
            if (student.getSex() == sex && student.getGroup().equals(group)) {
                System.out.println(student.toString());
                i++;
            }

        }

        if (i == 0) {
            System.out.println("Nothing to display.");
        }

    }

}
