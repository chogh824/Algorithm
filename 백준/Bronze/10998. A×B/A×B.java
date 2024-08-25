import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(N * X));
        bw.flush(); // 버퍼의 내용을 강제로 출력
        bw.close(); // BufferedWriter를 닫아줌으로써 자원 해제
    }
}
