import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            int count = 0;
            boolean isMinus = false;

            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    count++;
                } else if (ch == ')') {
                    count--;
                }

                if (count < 0) {
                    isMinus = true;
                }
            }

            if (count == 0 && !isMinus) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}