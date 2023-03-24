import java.util.Scanner;

public class triangleWork {
    public static void main(String[] args) {
        System.out.print("Введите длину стороны AB");
        Scanner in = new Scanner(System.in);
        int AB = in.nextInt();
        System.out.print("Введите длину стороны AC");
        int AC = in.nextInt();
        System.out.print("Введите длину стороны AC");
        int BC = in.nextInt();
        triangle triangle = new triangle( AB, AC, BC );

        System.out.println("Площадь: " + triangle.area());
        System.out.println("Периметр: " + triangle.perimeter());
        System.out.println(triangle.draw());
    }
}
