package org.example;


public class Main {
    public static void main(String[] args) {

        //1
        // Реализация интерфейса с помощью лямбда-выражения
        Mod13 сontroller = (value) -> value % 13 == 0;

        // Пример использования
        int value = 11;
        boolean res = сontroller.check(value);
        System.out.println(res); // Выведет: false

        value = 26;
        res = сontroller.check(value);
        System.out.println(res); // Выведет: true


        //2
        LongerString analyzer = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        // Пример использования
        String result2 = analyzer.analyzerStrings("Sber", "SberTech");
        System.out.println(result2);


        //3
        // Создание объекта интерфейса с помощью лямбда-выражения
        Diskriminant d1 = (a, b, c) -> b * b - 4 * a * c;

        // Пример использования
        double a = 3;
        double b = 4;
        double c = 5;
        double discriminant = d1.calculateDiscriminant(a, b, c);
        System.out.println("Дискриминант: " + discriminant);
    }

}
