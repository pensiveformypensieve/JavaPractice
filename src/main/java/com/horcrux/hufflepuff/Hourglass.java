package com.horcrux.hufflepuff;

import org.apache.log4j.Logger;

public class Hourglass {

    final Logger log = Logger.getLogger(Hourglass.class.getName());

    public void hourglass(int n) {
//        String s = "";
        String num = "";

        //print number
        for (int i = 0; i < n; i++) {
            log.debug("i: " + i);
//            s += " *";
            num += " " + (i+1);
        }

        //print space
        String space = "";
        for (int i = 0; i < n; i++) {
            log.debug("i: " + i);
            if(n>10){
                space += "  ";
            }
            space += " ";
        }

        //print top triangle
        for (int i = n; i > 0; i--) {
            //prints spaces from i
            System.out.print(space.substring(i));
            //prints stars from (n-1)*2 position
            System.out.println(num.substring((n - i) * 2));
        }

        //print bottom triangle
        //starts from 2 because if i=0, it will print an entire line of empty spaces
        //if starts from i=1, it will print a duplicate row, which was already printed in the top triangle
        for (int i = 2; i <= n; i++) {
            //prints spaces from i
            System.out.print(space.substring(i));
            //prints stars from (n-1)*2 position
            System.out.println(num.substring((n - i) * 2));
        }
    }


    /*
    first argument is no. of spaces which will be zero initially
    second arguments is number being passed in
    third argument is just to increment/decrement stars & spaces
    */
    public void hourglassRecursive(int space, int number, int increment) {

        /*
        This is the terminating condition.
        If space is negative and increment is also negative,
        it means that no. of spaces were positive before this function call.
        This implies that the lower half of the hourglass is completed,
        So just return from here without executing anything
        */
        if(space < 0 && increment < 0)
            return;

        String num = "";

        //print spaces
        for(int i = 0; i < space; i++)
            System.out.print(" ");

        //print stars with a space
        for(int i = 0; i < number; i++) {
//            System.out.print("* ");
            num = (i + 1) + " ";
            System.out.print(num);
        }

        System.out.println();

        /*
        If no. of stars is 1, then it means the upper half is completed.
        So, here the increment is set to -1
        So that from next recursive call onwards stars will increase and spaces will decrease by 1
        i.e. printing bottom half
        */
        if(number == 1)
            increment = -1;

        //call this function recursively
        hourglassRecursive(space + increment, number - increment, increment);
    }

}
