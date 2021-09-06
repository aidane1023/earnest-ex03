package exercise03;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the quote? ");
        String quote = userInput.nextLine();
        System.out.println("Who said the quote? ");
        String speaker = userInput.nextLine();

        System.out.println(speaker + " says, '" + quote + "'");
    }

}

