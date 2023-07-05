package training.day3;

public class Exercise1 {
    public static void main(String[] args){
        int[] numbers = new int[] {10, 2 -1, 1, 5, 9, 7, 7, 5, -5};


        for(int i = 0; i <= numbers.length; i++){
            if(i > 0)


                System.out.println("The negative numbers are: " + i);
            if(i % 2 > 0)
                System.out.println("The odd numbers are: " + i);
            if(i % 2 == 0)
                System.out.println("The even numbers are: " + i);
        }
    }
}
