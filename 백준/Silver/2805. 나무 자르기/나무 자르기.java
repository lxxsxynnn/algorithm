import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 필요한 나무의 길이

        int[] trees = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (max < trees[i]) {
                max = trees[i];
            }
        }

        // 이분 탐색 시작
        long low = 0;
        long high = max;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;

            // 절단기 높이가 mid일 때 가져갈 수 있는 나무의 총합 계산
            for (int tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            // 

            // 가져온 나무의 합이 필요한 양(M)보다 적으면 절단기를 낮춰야 함
            if (sum < M) {
                high = mid - 1;
            } 
            // 가져온 나무가 충분하면 일단 정답 후보 + 더 높여볼 수 있는지 확인
            else {
                result = mid;
                low = mid + 1;
            }
        }

        System.out.println(result);
    }
}