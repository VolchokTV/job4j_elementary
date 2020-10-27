package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Это игра 11. Смысл игры в следующем. На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.print("Первому игроку приготовиться. ");
        int table = 11;
        while (table > 0) {
            System.out.println("Сколько спичек вы заберете: ");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Пожалуйста, соблюдайте правила.");
                continue;
            } else {
                System.out.println("Игрок забрал " + select + " спички.");
                table = table - select;
                System.out.println(table + " спичек осталось на столе.");
            }
            System.out.println();
        }
        System.out.println(" Спичек не осталось. Игра окончена. Вы победили!");
    }
}
