import java.util.Scanner;

public class RectangleWork {
    public static void main(String[] args) {
        System.out.print("Введите ширину прямоугольника");
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        System.out.print("Введите длину прямоугольника");
        int length = in.nextInt();
        rectangle rectangle = new rectangle( width, length) ;

        System.out.println("Площадь: " + rectangle.area());
        System.out.println("Периметр: " + rectangle.perimeter());
//        System.out.println(rectangle.draw());
    }
}
