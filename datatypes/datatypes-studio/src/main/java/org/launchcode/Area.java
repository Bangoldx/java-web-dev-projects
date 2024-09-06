package org.launchcode;
import  java.util.Scanner;

public class Area {
    public static void main (String[] Args){
        Scanner input;
        double radius;
        double area;
        boolean

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        while(radius < 0 ){
            System.out.println("Enter a Valid radius: ");
            radius = input.nextDouble();
        }
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area + "cm\u00B2");

        input.close();
    }
}
