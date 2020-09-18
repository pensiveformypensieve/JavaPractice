package com.horcrux.hufflepuff;

import java.util.*;


public class HufflepuffApp {

    public static void main(String[] args) {

    String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
    String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
    System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia

    System.out.println(DoubleSum.average(2,1));

    Roots roots = QuadraticEquations.findRoots(2, 10, 8);
    System.out.println("Roots: " + roots.x1 + ", " + roots.x2);

    MapAlertDAO storage = new MapAlertDAO();
    Alert alert = new Alert(storage);
    UUID raiseAlert = alert.raiseAlert();
    Date alertTime = alert.getAlertTime(raiseAlert);
    System.out.println("alert time=" + alertTime + "raise alert UUID:" + raiseAlert);

    ProgrammerTeacher teacher = new ProgrammerTeacher();
    teacher.addLanguage("Java");

    Programmer programmer = new Programmer();
    teacher.teach(programmer, "Java");

    for(String language : programmer.getLanguages())
        System.out.println(language);

    System.out.println(Username.validate("Mike-Standish")); // Valid username
    System.out.println(Username.validate("Mike Standish")); // Invalid username

    System.out.println(Uniquename.firstUniqueName(new String[]{"Abbi", "Adeline", "Abbi", "Adalia"}));
    }
}

