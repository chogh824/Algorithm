import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        if (A <= B && B <= C) {
            System.out.println(B);
        } else if (A <= C && C <= B) {
            System.out.println(C);
        } else if (C <= A && A <= B) {
            System.out.println(A);
        } else if (C <= B) {
            System.out.println(B);
        } else if (A <= C) {
            System.out.println(A);
        } else {
            System.out.println(C);
        }
    }
}
