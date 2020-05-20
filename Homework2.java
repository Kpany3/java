package ru.geekbrains.homework2;

public class Homework2 {


    public static void main(String[] args) {


//        задание 1
//        Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        String mas1 = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            mas1 += a[i] + " ";

        }
        System.out.println(mas1);
//        задание 2
//        Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] b = new int[8];
        String mas2 = "";
        System.out.println("Задание 2");
        for (int i = 0; i < b.length; i++) {
            b[i] = i * 3;
            mas2 += b[i] + " ";

        }
        System.out.println(mas2);

//        задание 3
//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        String mas3 = "";
        System.out.println("Задание 3");
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
            }

            mas3 += c[i] + " ";
        }
        System.out.println(mas3);


//        задание 4
//        Создать квадратный двумерный целочисленный массив
//        (количество строк и столбцов одинаковое),
//         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] d = new int[5][5];
        String mas4 = "";
        System.out.println("Задание 4");
        for (int i = 0; i < d.length; i++) {

            for (int j = 0; j < d[i].length; j++) {
                if (i == j) {
                    d[i][j] = 1;
                }
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }


//        задание 5
//        Задать одномерный массив и найти в нем
//        минимальный и максимальный элементы (без помощи интернета);

        int[] e = {5, 4, 56, 12, -12, 15, 0};
        int numbMin = 0;
        int numbMax = 0;
        System.out.println("Задание 5");

        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (i == 0 && j == 1) {
                    if (e[i] > e[j]) {//для первой итерации
                        numbMax = e[i];
                        numbMin = e[j];
                    } else {
                        numbMax = e[j];
                        numbMin = e[i];
                    }
                } else {
                    if (e[i] > e[j]) {//проверка, если элемент больше следующего
                        if (e[i] > numbMax) {
                            numbMax = e[i];
                        }
                        if (e[j] < numbMin) {
                            numbMin = e[j];
                        }

                    } else {//проверка, если элемент меньше следующего
                        if (e[j] > numbMax) {
                            numbMax = e[j];
                        }
                        if (e[i] < numbMin) {
                            numbMin = e[i];
                        }
                    }
                }
            }
        }

        System.out.println("Минимальное число " + numbMin);
        System.out.println("Максимальное число " + numbMax);


//        задание 6
//        Написать метод, в который передается не пустой одномерный целочисленный массив,
//        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//        checkBalance([1, 1, 1, || 2, 1]) → true,
//        граница показана символами ||,эти символы в массив не входят.


        int[] f = {1, 1, 1, 2, 1};

        System.out.println("Задание 6");

        if (checkBalance(f)) {
            System.out.println("В массиве возможно равенство левой и правой части");
        } else System.out.println("В массиве невозможно равенство левой и правой части");


//        задание 7 (не сделано)
//        Написать метод, которому на вход подается одномерный массив и число n
//        (может быть положительным, или отрицательным),
//        при этом метод должен сместить все элементымассива на n позиций.
//        Для усложнения задачи нельзя пользоваться вспомогательными массивами.


        int[] g = {1, 2, 3, 4, 5};
        int n = 2;
        System.out.println("Задание 7");
        System.out.println("Ячейки массива сдвинулись на " + n);
        String masStr = "";
        int len = g.length;
        for (int i = 0; i < len; i++) {
            if (i + n < len) {
                int gin = g[i + n];
                g[i + n] = g[i];
                if (i + n + n < len) {
                    int ginn = g[i + n + n];
                    g[i + n + n] = g[i+n];
                } else {
                    int ginn = g[i + n + n - len];
                    g[i + n + n - len] = g[i+n];
                }

            } else {
                int gin = g[i + n - len];
                g[i + n - len] = g[i];

                if (i + n + n < len) {
                    int ginn = g[i + n + n];
                    g[i + n + n] = g[i+n];
                } else {
                    int ginn = g[i + n + n - len];
                    g[i + n + n - len] = g[i+n];
                }


            }
            System.out.print(g[i] + " ");
        }


//            System.out.print(masReverse(g, n));


    }

    //для задания 6
    static boolean checkBalance(int[] f) {
        int sumL = 0;
        int sumR = 0;
        boolean sumRL = false;
        for (int i = 0; i < f.length; i++) {
            sumL += f[i];
            sumR = 0;
            for (int j = i + 1; j < f.length; j++) {
                sumR += f[j];
            }
            if (sumL == sumR) {
                sumRL = true;
            }
        }
        return sumRL;
    }





}
