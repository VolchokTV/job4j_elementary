package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found.");
        }
        return rsl;

    }

    public static void main(String[] args) {
        FindEl myKey = new FindEl();
        String[] values = {"key", "jey", "may", "day", "ley", "pey"};
        String key = "kyi";
        try {
            System.out.println("Индекс элемента " + key + " в строковом массиве = " + myKey.indexOf(values, key) + ".");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}
