import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = 0;
        for(int i = 1; i <= a; i++){
            if ((a % i == 0) && (d <= 2)){
                d= d + 1;
            } else if (d > 2) {
                break;
            }


        }
        if(d<=2){
            System.out.println("prost");
        }else{
            System.out.println("neprost");
        }
    }
}