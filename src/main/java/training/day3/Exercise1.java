package training.day3;
import java.util.ArrayList;
public class Exercise1 {
    public static void main(String[] args){
        int[] numbers = new int[] {10, 2 -1, 1, 5, 9, 7, 7, 5, -5};
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int numbersEqualFive = 0;


        for(int i : numbers){
            if(i > 0)
                positiveNumbers.add(i);
            if(i < 0)
                negativeNumbers.add(i);
            if(i % 2 > 0)
                oddNumbers.add(i);
            if(i % 2 == 0)
                evenNumbers.add(i);
            if(i == Math.abs(5))
                numbersEqualFive++;

        }

        System.out.println("The positive numbers are: " + positiveNumbers);
        System.out.println("The negative numbers are: " + negativeNumbers);
        System.out.println("The odd numbers are: " + oddNumbers);
        System.out.println("The even numbers are:" + evenNumbers);
        System.out.println("The number 5 is found " + numbersEqualFive + " times.");
    }
}
