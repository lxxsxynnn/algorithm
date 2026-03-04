import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        long[] cables = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            cables[i] = Long.parseLong(br.readLine());
            if (max < cables[i]) {
                max = cables[i];
            }
        }

        // 이분 탐색 범위 설정 (하한은 1, 상한은 가장 긴 랜선의 길이)
        long low = 1;
        long high = max;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;

            // 모든 랜선을 mid 길이로 잘랐을 때 나오는 총 개수 계산
            for (int i = 0; i < K; i++) {
                count += (cables[i] / mid);
            }

            // 
            
            // 만든 개수가 필요한 개수보다 적으면? -> 더 짧게 잘라야 함
            if (count < N) {
                high = mid - 1;
            } 
            // 만든 개수가 필요한 개수보다 많거나 같으면? -> 일단 정답 후보
            // 더 길게 자를 수 있는지 확인하기 위해 길이를 늘려봄
            else {
                result = mid; 
                low = mid + 1;
            }
        }

        System.out.println(result);
    }
}