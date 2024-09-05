package org.launchcode;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        int milesDriven = input.nextInt();

        System.out.println("How many gallons of gas have you used?");
        int gallonsOfGas = input.nextInt();
        input.close();

        int mpg = milesDriven / gallonsOfGas;

        System.out.println("You got " + mpg + " mpg on your " + milesDriven + " drive.");
    }
}
