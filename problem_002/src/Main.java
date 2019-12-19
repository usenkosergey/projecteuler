import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=2
 * http://euler.jakumo.org/problems/view/2.html
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> chisla = new ArrayList<>();
        int summa = 0;

        chisla.add(2);
        chisla.add(3);

        for (; ; ) {
            if ((chisla.get(chisla.size() - 2) + chisla.get(chisla.size() - 1)) > 4_000_000) {
                break;
            } else {
                chisla.add(chisla.get(chisla.size() - 2) + chisla.get(chisla.size() - 1));

            }
        }


        for (Integer key : chisla) {
            if (key % 2 == 0) {
                summa = summa + key;
            }
        }

        System.out.println(summa);
    }
}
