package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        int miles;
        int gas;
        int mpg;
        Scanner milesin;
        Scanner gasin;

        milesin = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = milesin.nextInt();

        gasin = new Scanner(System.in);
        System.out.println("How much gas have you consumed (in gallons)?");
        gas = gasin.nextInt();

        mpg = miles / gas;
        System.out.println("Your car gets " + mpg + " miles per gallon.");
    }
}

// ignoreCase: true;