public class Main {
    public static void main(String[] args) {
        int answer=0;
        for (int i = 1; i <= 1000; i++) {
            for (int ii = 1; ii <= 1000; ii++) {
                for (int iii = 1; iii <= 1000; iii++) {
                    if (i + ii + iii == 1000 && i < ii && ii < iii && i*i+ii*ii==iii*iii) {
                        answer = i * ii * iii;
                        System.out.println(i);
                        System.out.println(ii);
                        System.out.println(iii);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
