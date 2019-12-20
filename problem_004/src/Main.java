import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int temp = 0;
        String tempStr = "";
        TreeMap<Integer, String> numbers = new TreeMap<>();

        for (int j = 100; j <= 999; j++) {
            for (int jj = 100; jj <= 999; jj++) {

                tempStr = Integer.toString(j * jj);

                String a = "";
                String b = "";

                for (int i = 0; i <= tempStr.length() / 2 - 1; i++) {
                    a = a + tempStr.charAt(i);
                    b = b + tempStr.charAt(tempStr.length() - i - 1);
                }
                if (a.equals(b)) {
                    numbers.put(Integer.parseInt(tempStr), (Integer.toString(j) + "*" + Integer.toString(jj)));
                }
            }
        }
        numbers.forEach((key, vol) -> System.out.println(key + " -> " + vol));
    }
}
