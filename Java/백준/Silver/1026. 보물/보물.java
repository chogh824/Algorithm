import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.reverseOrder());
        Collections.sort(arr);
        int result = 0;
        for(int i = 0; i < N; i++) {
            result += list.get(i) * arr.get(i);
        }

        System.out.println(result);

    }
}