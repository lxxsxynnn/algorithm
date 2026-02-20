import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
            sum += num;
        }

        // 1. 평균 구하기
        sb.append(Math.round((double) sum / N)).append("\n");

        // 2. 중앙값 구하기
        Arrays.sort(nums);
        sb.append(nums[N/2]).append("\n");

        // 3. 최빈값 구하기
        int[] counts = new int[8001];
        int maxFreq = 0;
        for (int i = 0; i < N; i++) {
            counts[nums[i] + 4000]++;
            maxFreq = Math.max(maxFreq, counts[nums[i] + 4000]);
        }

        int mode = 0;
        boolean isSecond = false; // 두 번째 최빈값인지 확인하는 플래그

        for (int i = 0; i < 8001; i++) {
            if (counts[i] == maxFreq) {
                mode = i - 4000; // 현재 인덱스를 실제 숫자로 변환
                if (isSecond) {
                    // 두 번째 최빈값을 찾았으므로 더 이상 돌지 않고 멈춤
                    break;
                }
                isSecond = true; // 첫 번째 최빈값을 만났음을 표시
            }
        }
        sb.append(mode).append("\n");

        // 4. 범위 구하기
        sb.append(nums[N - 1] - nums[0]);
        System.out.print(sb);
    }
}