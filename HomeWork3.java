package ru.geekbrains.homework3;

import java.util.Scanner;

public class HomeWork3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10);// генерируем рандомнео число
        System.out.println("Игра. Угадайте загаданное число от 0 до 9."); //выводим заголовок начала игры
        String getNum = guessnumber(randomNum);//
        System.out.println(getNum);
        System.out.println("Было загадано число " + randomNum);
    }

    public static String guessnumber(int randomNum) {
        int x;
        int tryNum = 1;
        do {
            x = sc.nextInt();
            if (tryNum < 4) {
                if (x > randomNum) {
                    System.out.println("Загаданное число меньше");
                } else if (x < randomNum){
                    System.out.println("Загаданное число больше");
                } else{
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




