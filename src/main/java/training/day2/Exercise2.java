package training.day2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.next();

        for(char c : word.toCharArray())
            System.out.println(c);
    }

}
