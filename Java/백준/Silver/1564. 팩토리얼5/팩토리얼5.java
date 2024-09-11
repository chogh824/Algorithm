import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 1;
        int countTwo = 0;
        int countFive = 0;

        // 팩토리얼 계산 및 최적화된 0 처리
        for (int i = 2; i <= N; i++) {
            int current = i;

            // 2의 개수를 세고 제거
            while (current % 2 == 0) {
                countTwo++;
                current /= 2;
            }

            // 5의 개수를 세고 제거
            while (current % 5 == 0) {
                countFive++;
                current /= 5;
            }

            // 나머지 값 곱하기
            result *= current;
            result %= 100000; // 항상 마지막 5자리만 유지
        }

        // 2와 5의 개수를 비교하여 남은 2에 대해 보정
        int extraTwo = countTwo - countFive;
        for (int i = 0; i < extraTwo; i++) {
            result *= 2;
            result %= 100000; // 다시 마지막 5자리만 유지
        }

        System.out.printf("%05d\n", result); // 항상 5자리 출력
    }
}
