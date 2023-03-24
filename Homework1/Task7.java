import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Vvedite n");
        int a = 0;
        int b = 1;

        int n;
        int sum;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.print(a + " " + b + " ");
        for(int i = 0; i < n - 2; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

    }
}