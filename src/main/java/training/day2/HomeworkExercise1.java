package training.day2;

public class HomeworkExercise1 {
    public static void main(String[] args){
        String[] words = {"alpha", "avatar", "trouble", "birch", "salon"};

        for(String str : words){
            if(str.startsWith("a"))
                System.out.println(str);
        }
    }
}
