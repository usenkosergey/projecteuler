public class Main {
    public static void main(String[] args) {
        long number = 600851475143L;

        for (long i = 1; i <= Math.round(number * 0.35) + 1; i++) {
            if (number % i == 0) {
                if (primeNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    static Boolean primeNumber(long number) {
        for (int i = 2; i <= Math.round(number * 0.35); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
