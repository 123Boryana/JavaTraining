package training.week2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }

    public void startCalculator() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an expression (1 + 2, -, *, /, plus, minus, multiply by, divide by): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private double evaluateExpression(String expression) {

        expression = expression.replaceAll("\\s+", "");

        expression = expression.replaceAll("plus", "+")
                .replaceAll("minus", "-")
                .replaceAll("multiply by", "*")
                .replaceAll("divide by", "/");

        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("*") || tokens[i].equals("/")) {
                double operand1 = parseOperand(tokens[i - 1]);
                double operand2 = parseOperand(tokens[i + 1]);
                double result;

                if (tokens[i].equals("*")) {
                    result = operand1 * operand2;
                } else {
                    if (operand2 == 0) {
                        throw new IllegalArgumentException("Cannot divide by zero");
                    }
                    result = operand1 / operand2;
                }

                tokens[i - 1] = String.valueOf(result);

                for (int j = i; j < tokens.length - 2; j++) {
                    tokens[j] = tokens[j + 2];
                }

                tokens = java.util.Arrays.copyOf(tokens, tokens.length - 2);

                i--;
            }
        }

        double result = parseOperand(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = parseOperand(tokens[i + 1]);

            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            } else {
                throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }

    private double parseOperand(String operand) {

        try {
            return Double.parseDouble(operand);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid operand: " + operand);
        }
    }
}