package com.horcrux.hufflepuff;

import org.apache.log4j.Logger;

public class Hourglass {

    final Logger log = Logger.getLogger(Hourglass.class.getName());

    public void hourglass(int n) {
        String s = "";

        //print number
        for (int i = 0; i < n; i++) {
            log.debug("i: " + i);
            String j = Integer.toString(i);
            s += " *";

        }

        //print space
        String w = "";
        for (int i = 0; i < n; i++) {
            log.debug("i: " + i);
            w += " ";
        }

        //print top triangle
        for (int i = n; i > 0; i--) {
            //prints spaces from i
            System.out.print(w.substring(i));
            //prints stars from (n-1)*2
            System.out.println(s.substring((n - i) * 2));
        }

        //print bottom triangle
        for (int i = 2; i <= n; i++) {
            //prints spaces from i
            System.out.print(w.substring(i));
            //prints stars from (n-1)*2
            System.out.println(s.substring((n - i) * 2));
        }
    }



}
