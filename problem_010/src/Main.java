public class Main {
    public static void main(String[] args) {
        long summa = 2L;

        for (int i = 3; i < 2_000_000; i++) {
            for (int ii = 2; ii <= i - 1; ii++) {
                if (i % ii == 0) {
                    break;
                } else {
                    if (ii == i - 1) {
                        summa = summa + i;
                    }
                }

            }

        }
        System.out.println(summa);
    }
}
