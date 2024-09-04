import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());
        br.close();
        int M1 = T % 60;
        int H1 = T / 60;

        if (H + H1 >= 23 && M + M1 >= 60) {
            System.out.println((H+H1-23) + " " + (M+M1-60));
        } else if (H+H1 < 23 && M+M1 >= 60) {
            System.out.println((H+H1+1) + " " + (M+M1-60));
        } else if (H + H1 > 23 && M + M1 < 60) {
            System.out.println((H+H1-24) + " " + (M+M1));
        } else {
            System.out.println((H+H1) + " " + (M+M1));
        }
    }
}
