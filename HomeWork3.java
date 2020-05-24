package ru.geekbrains.homework3;

import java.util.Scanner;

public class HomeWork3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10);// генерируем рандомнео число
        System.out.println("Игра. Угадайте загаданное число от 0 до 9."); //выводим заголовок начала игры
        String getNum = guessnumber(randomNum);// метод угадывания рандомного числа
        System.out.println(getNum);// вывод результата
        System.out.println("Было загадано число " + randomNum);// вывод результата
    }

    public static String guessnumber(int randomNum) {
        int x;//вводимая переменная
        int tryNum = 1;// первая попытка
        do {
            x = sc.nextInt();// консоль просит ввести число
            if (tryNum < 4) {//условие проверки колиечства попыток
                if (x > randomNum) {//если введеное число больше
                    System.out.println("Загаданное число меньше");
                } else if (x < randomNum){//если введеное число меньше
                    System.out.println("Загаданное число больше");
                } else{//если введеное число угадано
                    System.out.println("Число угадано за "+ tryNum + " попытки");
                    return "Вы выграли";
                }
                ++tryNum;
            } else{
                System.out.println("Количество попыток закончилось");
                return "Вы проиграли";
            }
        } while (x != randomNum);
        return "Число угадано и равно " + randomNum;
    }
}




