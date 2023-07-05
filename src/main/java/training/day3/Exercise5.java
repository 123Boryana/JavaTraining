package training.day3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercise5 {

    public static void swapper(ArrayList<String> list){
        if(list.size() >= 2){
            Collections.swap(list, 0, list.size() - 1 );
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the elements of your list: ");
        String input = scanner.next();

        while (!input.isEmpty()){
            list.add(input);
            input = scanner.next();
        }

        swapper(list);
    }
}
