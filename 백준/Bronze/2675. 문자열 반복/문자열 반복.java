import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        for (int i = 1; i <= S; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String P = st.nextToken();

            // StringBuilder는 결과를 저장하는 역할을 함!
            StringBuilder sb = new StringBuilder();

            // 문자열 P의 각 문자를 R번 반복함
            for (int j = 0; j < P.length(); j++) {
                char c = P.charAt(j);   // 배열에 있는 문자 맞추기
                for (int k = 0; k < R; k++) {
                    sb.append(c);   // R번 반복하여 추가하기
                }
            }

            System.out.println(sb.toString());
        }
    }
}
