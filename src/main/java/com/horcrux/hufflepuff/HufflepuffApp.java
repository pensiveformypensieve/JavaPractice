package com.horcrux.hufflepuff;

public class HufflepuffApp {

    public static void main(String[] args) {

        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia


        System.out.println(DoubleSum.average(2,1));

        Roots roots = QuadraticEquations.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);

    }
}
