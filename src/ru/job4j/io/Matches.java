package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Это игра 11. Смысл игры в следующем. На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.println("Первому игроку приготовиться. ");
        int table = 11;
        boolean player = true;
        while (table > 0) {
            String name = player ? "player_1" : "player_2";
            System.out.println(name + " Сколько спичек вы заберете? ");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Пожалуйста, соблюдайте правила.");
                continue;
            } else {
                System.out.println(name + " забрал " + select + " спички.");
                table = table - select;
                System.out.println(table + " спичек осталось на столе.");
                player = !player;
            }
            System.out.println();
        }
        player = !player;
        String name = player ? "player_1" : "player_2";
        System.out.println(" Спичек не осталось. Игра окончена. " + name + " победил.");
    }
}
