import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger count = BigInteger.ONE;

            for (int j = M; j > M - N; j--) {
                count = count.multiply(BigInteger.valueOf(j));
            }

            for (int k = 1; k <= N; k++) {
                count = count.divide(BigInteger.valueOf(k));
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
