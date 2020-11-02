package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Bus rides");
    }

    @Override
    public void passengers(int numOfPassengers) {
        System.out.println("The bus carries "  + numOfPassengers + " passengers.");
    }

    @Override
    public double refuel(int amountOfFuel) {
        return amountOfFuel * 46.89;
    }
}
