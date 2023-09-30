package com.example.extra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ExtraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtraApplication.class, args);

        ListOperations listOperations = new ListOperations();
        ArrayList<ExtendedStudent> allStudents = listOperations.create();
        listOperations.printBySexAndGroup(allStudents, 'm', "4b");

        MapOperations mapOperations = new MapOperations();
        Map<String, ExtendedStudent> studentsByID = mapOperations.create(allStudents);
        Map<String, ArrayList<ExtendedStudent>> studentsByGroups = mapOperations.createByGroups(allStudents);

        System.out.println("\n" + studentsByID + "\n");
        System.out.println(studentsByGroups + "\n");

        mapOperations.calculations(studentsByGroups);

        ExtendedStudent boss = new ExtendedStudent("Yuria", "Harudera", 'f', "5a", "boss", "pistol", 11);
        studentsByID.put("099213f002", boss);
        System.out.println("\nGet by key test: " + studentsByID.get("106213m001"));
        System.out.println("Contains by value: " + studentsByID.containsValue(boss));
    }

}
