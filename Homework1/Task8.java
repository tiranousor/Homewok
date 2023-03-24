import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c = eng.charAt(r.nextInt(eng.length()) );
        boolean bv = false;
        while(!bv){
            String a = in.nextLine();
            char b = a.charAt(0);
            if(b == c){
                System.out.println("Right");
                break;
            } else if (((int) c) < ((int) b))  {
                System.out.println("You’re too high");
            } else if (((int) c) > ((int) b)) {
                System.out.println("You’re too low");
            }
        }
    }
}
