package org.example;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        Product product = new Product();
        try {
            System.out.print("a*b = " + Calculator.multiply(a, b));
        }catch (Exception e){
            System.out.println("Введенное число нечетное");
        }finally {
            System.out.println("Попробуйте еще раз");
        }

    }
}
