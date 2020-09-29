package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        this.load = this.load - 5;
        another.load = another.load + 5;
    }

    public static void main(String[] args) {
        Battery firstBat = new Battery(40);
        Battery secondBat = new Battery(0);
        System.out.println("first : " + firstBat.load + ". second : " + secondBat.load);
        firstBat.exchange(secondBat);
        System.out.println("first : " + firstBat.load + ". second : " + secondBat.load);
        firstBat.exchange(secondBat);
        System.out.println("first : " + firstBat.load + ". second : " + secondBat.load);
        firstBat.exchange(secondBat);
        System.out.println("first : " + firstBat.load + ". second : " + secondBat.load);

    }

}
