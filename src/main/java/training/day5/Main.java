package training.day5;

public class Main {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(5, 8);
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.calculatePerimeter());

        Shape triangle = new Triangle(3, 6, 4, 9);
        System.out.println("The area of the triangle is: " + triangle.calculateArea());
        System.out.println("The perimeter of the triangle is: " + triangle.calculatePerimeter());
    }
}
