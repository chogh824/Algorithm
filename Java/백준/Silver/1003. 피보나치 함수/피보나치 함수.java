import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] queries = new int[T];
        int maxN = 0;
        for (int i = 0; i < T; i++) {
            queries[i] = Integer.parseInt(br.readLine());
            if (queries[i] > maxN) maxN = queries[i];
        }

        int[] zero = new int[maxN + 1];
        int[] one  = new int[maxN + 1];

        zero[0] = 1; one[0] = 0;
        if (maxN >= 1) {
            zero[1] = 0; one[1] = 1;
        }

        for (int i = 2; i <= maxN; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i]  = one[i - 1]  + one[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int n : queries) {
            sb.append(zero[n]).append(' ').append(one[n]).append('\n');
        }
        System.out.print(sb);
    }
}