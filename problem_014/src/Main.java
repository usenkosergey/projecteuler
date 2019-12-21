public class Main {
    public static void main(String[] args) {
        int count;
        int answer = 0;
        long x = 0;
        for (int i = 999999; i >= 1; i--) {
            count = 0;
            x = i;
            for (; ; ) {
                count++;
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = x * 3 + 1;
                }
                if (x == 1) {
                    count++;
                    break;
                }
            }
            if (answer < count) {
                System.out.println(i + " делителей - " + count);
                answer = count;
            }
        }
    }
}
