package ru.andreyshurygin.homework1;

public class HomeWork {

    public static void main(String[] args) {

        //задание 2
        int a = 5;              //для
        double b = 3.5;         //задания
        float c = (float) 0.5;  //под
        byte d = 1;             //номером 3
        short e = 45;
        char f = 'g';
        long g = 345234346;

        //для задания 4
        int x = 7;
        int y = 9;

        //для задания 5
        int num = -4;

        //для задания 7
        String name = "Вася";

        //для задание 8
        int year = 2004;

        //задание 3
        float math = (float) solveMath(a, b, c, d);
        System.out.println(math);


        //задание 4

        if (verifySum(x, y) >= 10 && verifySum(x, y) <= 20) {
            System.out.println("Сумма равна " + verifySum(x, y) + " и лежит в промежутке от 10 до 20 включительно ");
        } else
            System.out.println("Сумма равна " + verifySum(x, y) + " и не лежит в промежутке от 10 до 20 включительно ");

        // задание 5

        if (isPositiveNum(num)) {
            System.out.println("Введеное число больше или равно нолю");
        } else
            System.out.println("Введеное число отрицательное");


        //задание 6
        if (!isPositiveNum(num)) {
            System.out.println("Введеное число отрицательное");
        } else
            System.out.println("Введеное число больше или равно нолю");


        //задание 7
        sayHello(name);

        // задание 8
        if (isVisokosniyGod(year)) {
            System.out.println("Введен високосный год");
        } else System.out.println("Введен невисокосный год");

    }

    //задание 3
    static double solveMath(int a, double b, float c, float d) {
        return a * (b + (c / d));
    }

    //задание 4
    static float verifySum(float a, float b) {
        return a + b;
    }

    //задание 5
    static boolean isPositiveNum(int a) {
        return a >= 0;
    }

    //задание 7
    static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //задание 8
    static boolean isVisokosniyGod(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else return a % 4 == 0;

    }

    //Задание 8


}
