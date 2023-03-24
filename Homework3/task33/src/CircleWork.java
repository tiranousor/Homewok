import java.util.Scanner;
public class CircleWork {
        public static void main(String[] radcol) {
            System.out.print("Введите радиус круга");
            Scanner in = new Scanner(System.in);
            int radius = in.nextInt();
            Circle circle = new Circle(radius, Color);

            System.out.format("Площадь: %f \n", circle.area());
            System.out.format("Периметр: %f\n", circle.perimeter());
            System.out.println(circle);
        }
}