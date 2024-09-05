package org.launchcode;
import java.util.Scanner;


public class StringSearch {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to search for?");
        String searchTerm = input.nextLine();
        input.close();

        boolean included = sentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println(included);

        Integer index = sentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        System.out.println("Your search of " + searchTerm + " is located at index " + index + " and is " + length + " characters long.");
        String manipulatedSentence = sentence.replace(searchTerm, "");
        System.out.println(manipulatedSentence);
    }
}
