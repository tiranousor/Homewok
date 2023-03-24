import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int copy = a;
        int reverse = 0;

        while(copy != 0) {
            reverse = reverse * 10 + copy % 10;
            copy /= 10;
        }
        if(reverse == a) {
            System.out.println(a + " is a Palindrome!");
        }
        else {
            System.out.println(a + " is not a Palindrome!");
        }
    }
}