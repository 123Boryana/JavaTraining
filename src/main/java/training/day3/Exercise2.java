package training.day3;

import java.util.Scanner;
public class Exercise2 {

public static String remover(String first, String second){
        return first.replace(second, "");
}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first word: ");
        String firstWord = scanner.next();
        System.out.println("Write your second word: ");
        String secondWord = scanner.next();
        String newWord = remover(firstWord, secondWord);

        System.out.println("The result is: " + newWord);
    }
}
