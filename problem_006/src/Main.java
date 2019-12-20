public class Main {
    public static void main(String[] args) {
        Long summa = 0L;
        Long summaKvad = 0L;

        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
            summaKvad = summaKvad + i * i;

        }
        System.out.println(summa * summa - summaKvad);
    }
}
