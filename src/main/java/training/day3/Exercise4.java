package training.day3;
import java.util.Scanner;
public class Exercise4 {

    public static void makeInitials(String name){
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for(String str : words) {
            if(!str.isEmpty())
                initials.append(Character.toUpperCase(str.charAt(0)));
        }
        System.out.println("Your initials are: " + initials);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = scanner.next();
        makeInitials(name);
    }
}
