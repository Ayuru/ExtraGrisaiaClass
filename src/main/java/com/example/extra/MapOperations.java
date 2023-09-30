package com.example.extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapOperations {


    public Map<String, ExtendedStudent> create(ArrayList<ExtendedStudent> students) {

        Map<String, ExtendedStudent> mapOfStudents = new HashMap<>();
        int i = 100;

        for (ExtendedStudent student : students) {

            mapOfStudents.put(i + "213" + student.getSex() + "001", student);
                    i++;

        }

        return mapOfStudents;
    }

    public Map<String, ArrayList<ExtendedStudent>> createByGroups(ArrayList<ExtendedStudent> students) {

        Map<String, ArrayList<ExtendedStudent>> mapOfStudents = new HashMap<>();

        for (ExtendedStudent student : students) {
            if (mapOfStudents.containsKey(student.getGroup())) {

                ArrayList<ExtendedStudent> temp = mapOfStudents.get(student.getGroup());
                temp.add(student);
                mapOfStudents.replace(student.getGroup(), temp);

            } else {

                ArrayList<ExtendedStudent> temp = new ArrayList<>();
                temp.add(student);
                mapOfStudents.put(student.getGroup(), temp);

            }

        }

        return mapOfStudents;

    }


    public void calculations(Map<String, ArrayList<ExtendedStudent>> studentsByGroups) {

        int totalNumber = 0;

        for (Map.Entry<String, ArrayList<ExtendedStudent>> entry : studentsByGroups.entrySet()) {

            System.out.println("Class " + entry.getKey() + " size: " + entry.getValue().size());
            totalNumber += entry.getValue().size();

        }

        System.out.println("Average: " + totalNumber/studentsByGroups.size());

    }
}
