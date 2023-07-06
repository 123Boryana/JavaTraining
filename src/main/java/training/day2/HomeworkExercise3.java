package training.day2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class HomeworkExercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        for (int i = 0; i < 4; i++ ) {
            System.out.println("Type in your word: ");
            words.add(scanner.next());
        }

        List<String> filteredwWords = new ArrayList<>();
        for (String str : words) {
            if (str.length() >= 4)
                filteredwWords.add(str);
        }

        if (filteredwWords.isEmpty())
            System.out.println("There are no words with more than four characters.");
        else
            System.out.println("The filtered words are: " + filteredwWords);
    }
}