package training.day3;
import java.util.Scanner;
public class Exercise3 {

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            String reversedSentence = reverseSentence(sentence);
            System.out.println("Reversed sentence: " + reversedSentence);

            scanner.close();

    }
}
