import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

            int count = 1;
            int minRank = arr[0][1];

            for (int k = 1; k < N; k++) {
                if (arr[k][1] < minRank) {
                    count++;
                    minRank = arr[k][1];
                }
            }

            System.out.println(count);
        }
    }
}
