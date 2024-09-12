package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numArray.length; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        String sentence = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        System.out.println(sumEven(numList));

        ArrayList<String> words = new ArrayList<>();
        for (int j = 0; j < wordArray.length; j++) {
            words.add(wordArray[j]);
        }

        System.out.println(fiveLetters(words));;
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> fiveLetters(ArrayList<String> arr) {
        ArrayList<String> word = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == numChars) {
                word.add(arr.get(i));
            }
        }
        return word;
    }
}