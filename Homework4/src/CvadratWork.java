import java.util.Scanner;

public class CvadratWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника");
        int length = in.nextInt();
        cvadrat cvadrat = new cvadrat(length) ;

        System.out.println("Площадь: " + cvadrat.area());
        System.out.println("Периметр: " + cvadrat.perimeter());
        System.out.println(cvadrat.draw());
    }
}
