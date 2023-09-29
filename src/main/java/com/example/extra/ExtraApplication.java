package com.example.extra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ExtraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtraApplication.class, args);

        ListOperations listOperations = new ListOperations();
        ArrayList<ExtendedStudent> allStudents = listOperations.create();
        listOperations.printBySexAndGroup(allStudents, 'm', "3a");
    }

}
