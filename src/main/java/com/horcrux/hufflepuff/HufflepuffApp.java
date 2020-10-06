package com.horcrux.hufflepuff;

import java.time.LocalDate;
import java.util.*;
import org.apache.log4j.Logger;


public class HufflepuffApp {

    public static void main(String[] args) {

    final Logger log = Logger.getLogger(HufflepuffApp.class.getName());

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

    log.debug("adding new teacher");
    ProgrammerTeacher teacher = new ProgrammerTeacher();
    teacher.addLanguage("Java");

    log.debug("adding new student");
    Programmer programmer = new Programmer();
    teacher.teach(programmer, "Java");

    for(String language : programmer.getLanguages()) {
        System.out.println(language);
    }

    System.out.println(Username.validate("Mike-Standish")); // Valid username
    System.out.println(Username.validate("Mike Standish")); // Invalid username

    System.out.println(Uniquename.firstUniqueName(new String[]{"Abbi", "Adeline", "Abbi", "Adalia"}));

    Hourglass hg = new Hourglass();
    Scanner console = new Scanner(System.in);
    System.out.println("Enter an integer greater than or equal to 2");
    int n = 0;
    try {
    n = console.nextInt();
    }
    catch (InputMismatchException e) {
    e.getMessage();
    }
    if (n < 2) {
    System.out.println("Invalid input");
     }
    else {
    System.out.println("");
    hg.hourglass(n);
    System.out.println("");
        }

        LocalDate dob = LocalDate.of(1900,9,17);
        LocalDate today = LocalDate.now();
        AgeCalculator ac = new AgeCalculator();
        String age = ac.calculateAgeFromBirthdate(dob, today);
        System.out.println(age);

    }

}

