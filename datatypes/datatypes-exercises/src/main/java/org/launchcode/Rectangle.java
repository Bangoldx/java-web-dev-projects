package org.launchcode;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your Rectangle?");
        int length = input.nextInt();

        System.out.println("What is the width of your Rectangle?");
        int width = input.nextInt();
        input.close();

        int areaOfRectangle = (length * width);
        System.out.println("Your rectangle with a legnth of " + length + " and width of " + width + " is " + areaOfRectangle);
    }
}
