
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N > 100) {
            return;
        }

        BigInteger value = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE);
        sb.append(value).append("\n");

        if (N <= 20) {
            Hanoi(N, 1, 2, 3);
        }

        System.out.println(sb);

    }

    public static void Hanoi(int N, int start, int mid, int end) {
        if (N == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        Hanoi(N - 1, start, end, mid);
        sb.append(start).append(" ").append(end).append("\n");
        Hanoi(N - 1, mid, start, end);
    }
}