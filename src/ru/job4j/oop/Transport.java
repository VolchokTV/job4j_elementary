package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle trainTomas = new Train();
        Vehicle flowerBus = new Bus();

        Vehicle[] veh = new Vehicle[]{airplane, trainTomas, flowerBus};
        for (Vehicle v : veh) {
            v.move();
            v.environ();
        }
    }
}
