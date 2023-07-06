package training.day3;
import java.util.Scanner;

public class Exercise4 {
    public static void printInitials(String name) {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        System.out.println("Initials: " + initials);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
        printInitials(name);
    }
}
