package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {

    public static float calcArea(float radius) {
        return (float) (PI * Math.pow(radius,2));
        //return (float) (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius?");
        float userRadius = input.nextFloat();
        while(userRadius <= 0) {
            System.out.println("Invalid radius.");
            userRadius = input.nextFloat();
        }
        float userArea = calcArea(userRadius);
        System.out.printf("The area is %f for radius of %f", userArea, userRadius);
    }
}

/*
do {

}while ();
*/

/*public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float userRadius;
    System.out.println("enter radius");
    do{
        userRadius = input.nextFloat();
        if (userRadius <= 0)
            System.out.println("Invalid");
    }while(userRadius <= 0);
}*/