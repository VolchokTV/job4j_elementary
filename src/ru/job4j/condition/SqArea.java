package ru.job4j.condition;

public class SqArea {
       public static double square (int p, int k){
           double h = p / (2 * (k + 1));
           double l = h * k;
           double rsl = l * h;
           return rsl;
        }

        public static void main (String[] args){
           double result1 = SqArea.square(8,2);
           System.out.println(" p = 8, k = 2, s = 2, real = " + result1);
       }
}
