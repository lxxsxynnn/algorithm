import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = 1;

            // a를 b번 곱하되, 곱할 때마다 10으로 나눈 나머지만 남김
            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
            }

            // 나머지가 0이면 10번 컴퓨터가 처리
            if (result == 0) result = 10;

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}