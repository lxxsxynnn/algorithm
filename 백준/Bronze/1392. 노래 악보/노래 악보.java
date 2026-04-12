import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 노래 개수
        int Q = Integer.parseInt(st.nextToken()); // 질문 개수

        int[] timeLine = new int[10001];
        int currentTime = 0;

        for (int i = 1; i <= N; i++) {
            int duration = Integer.parseInt(br.readLine());
            for (int j = 0; j < duration; j++) {
                timeLine[currentTime++] = i;
            }
        }

        for (int i = 0; i < Q; i++) {
            int queryTime = Integer.parseInt(br.readLine());
            System.out.println(timeLine[queryTime]);
        }
    }
}