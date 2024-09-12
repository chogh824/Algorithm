import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        long result = 1;
        int countTwo = 0;
        int countFive = 0;
        for (int i = 2; i <= N; i++) {
            int current = i;
            while (current % 2 == 0) {
                countTwo++;
                current /= 2;
            }

            while (current % 5 == 0) {
                countFive++;
                current /= 5;
            }
            result *= current;
        }

        System.out.println(countFive);
    }
}