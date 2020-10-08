package ru.job4j.condition;

public class WeeklySalary {
    private static int calculate;
    public static int calculate(int[] hours) {
        calculate = 0;
        for (int i = 0; i < hours.length; i++){

            if (i <= 4) {
                if (hours[i] > 8) {
                    calculate = calculate + (hours[i] * 10 + (hours[i] - 8) * 5);
                }
                else {
                    calculate = calculate + hours[i] * 10;
                }
                }
                else {
                if (hours[i] > 8) {
                    calculate = calculate + (hours[i] * 20 + (hours[i] - 8) * 10);
                }
                else {
                    calculate = calculate + hours[i] * 20;
                }
            }
        }
        return calculate;
    }
}