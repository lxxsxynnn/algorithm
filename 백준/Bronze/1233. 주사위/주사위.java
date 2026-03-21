import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        // 합계의 빈도를 저장할 배열
        int[] counts = new int[81];

        // 모든 경우의 수 전수 조사
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    counts[i + j + k]++;
                }
            }
        }

        int maxCount = 0;
        int result = 0;

        // 가장 많이 나온 합계 찾기
        for (int i = 3; i <= 80; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}