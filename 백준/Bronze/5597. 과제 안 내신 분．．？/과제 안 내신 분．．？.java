import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        for (int j = 1; j <= 28; j++) {
            int T = Integer.parseInt(br.readLine());
            list.remove(Integer.valueOf(T));    // T를 값으로 인식하게 하기 위해 Integer 객체로 변환시켜야함!
        }

        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min);
        System.out.println(max);
    }
}
