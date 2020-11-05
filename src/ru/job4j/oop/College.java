package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объекта класса Freshman. */
        Freshman alex = new Freshman();
        /* делаем приведение к типу родителя Student. */
        Student studentAlex = alex;
        /* делаем приведение к типу родителя Object. */
        Object objAlex = alex;
        /* повышающее приведение (up casting). Приведение типа при создании объекта. */
        Object objFresh = new Freshman();
    }
}
