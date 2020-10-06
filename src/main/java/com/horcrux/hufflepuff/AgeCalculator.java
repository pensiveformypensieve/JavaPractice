package com.horcrux.hufflepuff;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public String calculateAgeFromBirthdate(LocalDate dob, LocalDate today) {

        Period dateDiff = Period.between(dob, today);
        String age = "age: " + dateDiff.getYears() + "years" + dateDiff.getMonths() + "months" + dateDiff.getDays() + "days";
        return age;
    }
}
