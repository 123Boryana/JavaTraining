package training.week2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Write your second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /, addition, subtraction, multiplication, division)");
        String operator = scanner.next();
        double value = 0;

        switch (operator) {
            case "+":
            case "addition":
                value = num1 + num2;
                break;
            case "-":
            case "subtraction":
                value = num1 - num2;
                break;
            case "*":
            case "multiplication":
                value = num1 * num2;
                break;
            case "/":
            case "division":
                value = num1 / num2;
            default:
                System.out.println("Wrong entry");
        }
        System.out.println(num1 + " " + operator + " " + num2  + " = " +  value);
    }
}
