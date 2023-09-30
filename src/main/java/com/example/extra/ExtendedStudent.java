package com.example.extra;

public class ExtendedStudent extends Student {
    String speciality;
    String mainWeapon;
    int kills;

    public ExtendedStudent(String name, String surname, char sex, String group, String speciality, String mainWeapon, int kills) {
        super(name, surname, sex, group);
        this.speciality = speciality;
        this.mainWeapon = mainWeapon;
        this.kills = kills;

    }

    public String getSpeciality() {
        return speciality;
    }

    public String getMainWeapon() {
        return mainWeapon;
    }

    public int getKills() {
        return kills;
    }
}
