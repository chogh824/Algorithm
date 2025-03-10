import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 1000 - Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(50);
        list.add(10);
        list.add(5);
        list.add(1);

        int count = 0;
        for (Integer integer : list) {
            if (T / integer > 0) {
                count += T / integer;
                T = T % integer;
            }
        }

        System.out.println(count);
    }
}
