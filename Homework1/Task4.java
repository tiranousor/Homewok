import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int reverse = 0;

        while(a != 0) {
            reverse = reverse + (a % 10);
            a /= 10;
        }
        System.out.println(reverse);
    }
}