import java.util.Scanner;
public class CircleWork {
    public static void main(String[] args) {
        System.out.print("Введите радиус круга");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        Cirlce circle = new Cirlce(radius);

        System.out.println("Площадь: " + circle.area());
        System.out.println("Периметр: " + circle.perimeter());
        System.out.println(circle.draw());
    }
}
