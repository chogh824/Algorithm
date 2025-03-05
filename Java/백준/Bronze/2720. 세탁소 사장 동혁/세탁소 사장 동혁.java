import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < T; i++) {
            int Q = list.get(i) / 25;
            int D = (list.get(i) % 25) / 10;
            int N = ((list.get(i) % 25) % 10) / 5;
            int P = ((list.get(i) % 25) % 10) % 5;

            System.out.println(Q +" "+D +" "+N+" "+P);
        }
    }
}
