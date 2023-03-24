import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String s = "";
        while (a != 0){
            if(a == 100){
                System.out.println("C");
                break;
            } else if (a > 50) {
                s = "L";
                a = a - 50;
            } else if (a == 50) {
                System.out.println("L");
                break;
            } else if (a < 50) {
                while (a > 9){
                    a = a - 10;
                    s = s + "X";
                }
                if(a == 9){
                    s = s + "IX";
                    a = a - 9;
                }
                if (a == 4){
                    s = s + "IV";
                    a = a - 4;
                }
                if(a > 4){
                    a = a - 5;
                    s = s + "V";
                }
                while (a != 0){
                    a = a - 1;
                    s = s + "I";
                }
            }
        }
        System.out.println(s);
    }
}