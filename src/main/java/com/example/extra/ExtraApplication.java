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
        listOperations.printBySexAndGroup(allStudents, 'm', "3a");

        MapOperations mapOperations  = new MapOperations();
        Map<String, ExtendedStudent> studentsByID = mapOperations.create(allStudents);
        Map<String, ArrayList<ExtendedStudent>> studentsByGroups = mapOperations.createByGroups(allStudents);

        System.out.println("\n" + studentsByID + "\n");
        System.out.println(studentsByGroups + "\n");

        mapOperations.calculations(studentsByGroups);
    }

}
