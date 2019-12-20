public class Main {
    public static void main(String[] args) {
        boolean cycleOne = true;
        for (int i = 20; cycleOne; i = i + 20) {
            for (int ii = 1; ii <= 20; ii++) {
                if (i % ii == 0) {
                    if (ii == 20) {
                        System.out.println(i);
                        cycleOne = false;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
