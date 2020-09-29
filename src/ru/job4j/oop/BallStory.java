package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball Kolobok = new Ball();
        Hare Zayac = new Hare();
        Wolf SeriyVolk = new Wolf();
        Fox GingerFox = new Fox();
        Zayac.tryEat(Kolobok);
        Kolobok.tryEat(Kolobok);
        SeriyVolk.tryEat(Kolobok);
        Kolobok.tryEat(Kolobok);
        GingerFox.tryEat(Kolobok);
        Kolobok.tryEat(Kolobok);
        GingerFox.tryEatSecondTime(Kolobok);
        Kolobok.tryEat(Kolobok);
        GingerFox.tryEatThirdTime(Kolobok);
    }
}
