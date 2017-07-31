package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner lengthin;
        Scanner widthin;

        lengthin = new Scanner(System.in);
        System.out.println("Enter the length");
        length = lengthin.nextInt();

        widthin = new Scanner(System.in);
        System.out.println("Enter the width");
        width = lengthin.nextInt();

        area = length * width;
        System.out.println("The area is: " + area);
    }
}
