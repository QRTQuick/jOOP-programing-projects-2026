package projectfour;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle(2.5),
            new Rectangle(3, 4),
            new Circle(1.2)
        };

        for (Shape s : shapes) {
            s.draw();
            System.out.printf("Area: %.2f\n", s.area());
        }
    }
}
