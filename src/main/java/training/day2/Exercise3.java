package training.day2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your kilograms: ");
        int kilograms = scanner.nextInt();

        if(kilograms >= 111)
            System.out.println("You're extra obese.");
        else if(kilograms >= 91)
            System.out.println("You're obese.");
        else if(kilograms >= 71)
            System.out.println("You're skinny fat.");
        else if(kilograms >= 50)
            System.out.println("You're skinny.");

    }

}