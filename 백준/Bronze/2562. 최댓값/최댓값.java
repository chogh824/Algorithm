import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] numbers = new int[9];

            for (int i = 0; i < 9; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }

            int maxValue = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < 9; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                    maxIndex = i + 1;
                }
            }
        System.out.println(maxValue);
        System.out.println(maxIndex);

    }
}
