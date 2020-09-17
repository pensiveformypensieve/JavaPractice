package com.horcrux.hufflepuff;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;

public class QuadraticEquations {

    public static Roots findRoots(double a, double b, double c) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");

        final Logger log = Logger.getLogger(Roots.class.getName());

        double result = b * b - 4.0 * a * c;

        double r1 = 0.0;
        double r2 = 0.0;

        if (result > 0.0) {
            r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            log.debug("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            r1 = -b / (2.0 * a);
            log.debug("The root is " + r1);
        } else {
            log.debug("The equation has no real roots.");
        }

        Roots rootObj = new Roots(r1, r2);

        return rootObj;
    }


}
