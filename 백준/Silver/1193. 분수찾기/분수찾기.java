import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        while (N > i) {
            N -= i;
            i++;
        }

        if (i % 2 == 1) {
            System.out.println((i + 1 - N) + "/" + N);
        } else {
            System.out.println(N + "/" + (i + 1 - N));
        }
    }
}