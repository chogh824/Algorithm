import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int minValue = Integer.MAX_VALUE;    // 최솟값 초기화
        int count = 0;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                count += i;

                if (i < minValue) {
                    minValue = i;
                }
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            System.out.println(minValue);
        }

    }

    public static boolean isPrime(int num) {    // 소수 판별식
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
