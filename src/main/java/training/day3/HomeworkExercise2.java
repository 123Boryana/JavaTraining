package training.day3;

import java.util.Scanner;
public class HomeworkExercise2 {

    public static void evenOrOdd(int i) {

        if (i % 2 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number: ");
        int number = scanner.nextInt();
        evenOrOdd(number);
    }
}
