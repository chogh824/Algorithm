import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        for (int i = 3; i < 10; i++) {
            list.add(list.get(i-1) + list.get(i-2) + list.get(i-3));
        }

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(list.get(K - 1));
        }
    }
}