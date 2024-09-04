import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int maxValue = Math.max(A,Math.max(B, C));

        if (A == B && B == C) {
            bw.write(String.valueOf(10000 + A * 1000));
        } else if (A == B) {
            bw.write(String.valueOf(1000 + A * 100));
        } else if (B == C) {
            bw.write(String.valueOf(1000 + B * 100));
        } else if (A == C) {
            bw.write(String.valueOf(1000 + A * 100));
        } else {
            bw.write(String.valueOf(100 * maxValue));
        }

        bw.flush();
        bw.close();
    }
}