package training.day2;

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Write your username: ");
            String name = scanner.next();
            System.out.println("Write your password: ");
            String password = scanner.next();
            if(name.equals("Ivan") && password.equals("1234")){
                System.out.println("Welcome, Ivan");
                break;
            }
            else
                System.out.println("Wrong credentials");
        }

    }
}