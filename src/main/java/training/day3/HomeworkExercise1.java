package training.day3;
import java.util.Scanner;
public class HomeworkExercise1 {

    public static int smallestNumber(int[] numbers){
        int minimumValue = numbers[0];
        for(int i : numbers){
            if(i < minimumValue)
                minimumValue = i;
        }
        return minimumValue;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Write your number: ");
            numbers[i] = scanner.nextInt();
        }
        int minimumValue = smallestNumber(numbers);
        System.out.println("The smallest number is: " + minimumValue);
    }
}
