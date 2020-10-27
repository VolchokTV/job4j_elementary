package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Вы спросили. " + name + " Это хороший вопрос. Мой ответ - Да. ");
        } else if (answer == 1) {
            System.out.println("Вы спросили. " + name + " Это плохой вопрос. Мой ответ - Нет. ");
        } else {
            System.out.println("Вы спросили. " + name + " Я думаю вы и сами уже знаете ответ. Оракул говорит - Может быть. ");
        }
    }
}
