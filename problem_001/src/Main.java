import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=1
 * http://euler.jakumo.org/problems/view/1.html
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int summa = 0;

        for (int i = 3; i < 1000; i = i + 3) {
            numbers.add(i);
        }
        for (int i = 5; i < 1000; i = i + 5) {
            if (numbers.contains(i)) {
            } else {
                numbers.add(i);
            }
        }
        for (int key : numbers) {
            summa = summa + key;
        }
        System.out.println(summa);
    }
}
