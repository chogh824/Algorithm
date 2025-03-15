import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int result = N;

        do {
            int A = result / 10;
            int B = result % 10;
            int K = (A + B) % 10;
            result = 10 * B + K;
            count++;
        } while (result != N);

        System.out.println(count);
    }
}
