package training.day5;

public class Triangle implements Shape {

    int a;
    int ha;
    int b;
    int c;

    public Triangle(int a, int ha, int b, int c) {
        this.a = a;
        this.ha = ha;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculateArea() {
        return a * ha / 2;
    }

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }
}
