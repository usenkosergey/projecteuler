import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        boolean oneCycle = true;
        TreeSet<Long> primeNumbers = new TreeSet<>();
        primeNumbers.add(2L);

        for (int i = 2; oneCycle; i++) {
            for (int ii = 2; ii < i; ii++) {
                if (!(i % ii == 0)) {
                    if (ii == (i - 1)) {
                        primeNumbers.add((long) i);
                        if (primeNumbers.size() == 10001) {
                            oneCycle = false;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(primeNumbers.last());
    }
}
