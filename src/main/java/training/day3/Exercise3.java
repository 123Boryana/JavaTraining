package training.day3;
import java.util.Scanner;
public class Exercise3 {

    public static String reverse(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            reverseSentence.append(words[i]);

            if(i != 0)
                reverseSentence.append(" ");
        }
        return reverseSentence.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();

        String reversedSentence = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversedSentence);


    }
}
