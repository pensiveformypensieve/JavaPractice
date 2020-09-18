package com.horcrux.hufflepuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

    public static boolean validate(String username) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int minLength = 6;
        int maxLength = 16;

        /*
        [a-zA-Z]{1} -> first character only accepts letters
        ^ -> starts with
        $ -> last character
        [] -> each set of characters
        * -> any character in the center
        [a-zA-Z0-9\-]* -> any character in this set, including hyphen for the middle part of the string
        [a-zA-Z0-9]$ -> any character in this set for the last part of the string
         */
        String regx = "^[a-zA-Z]{1}[a-zA-Z0-9\\-]*[a-zA-Z0-9]$";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(username);

        String parts[] = username.split("a-zA-Z\\-");

        if (username.length() >= minLength && username.length() <= 16){

            if(matcher.matches() && parts.length < 2){
                return true;
            }
        }

        return false;
    }
}
