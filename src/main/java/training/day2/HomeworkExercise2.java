package training.day2;

import java.util.Scanner;

public class HomeworkExercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int[] array = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter your number: " );
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("The sum of the elements is: " + sum);
    }
}