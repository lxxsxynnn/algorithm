import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 1부터 차례대로 숫자를 키워가며 확인
        int val = 1;
        while (true) {
            int count = 0;

            // 5개의 숫자 중 현재 val을 나누어 떨어지게 하는 게 몇 개인지 체크
            for (int i = 0; i < 5; i++) {
                if (val % nums[i] == 0) {
                    count++;
                }
            }

            // 적어도 3개 이상이면 정답
            if (count >= 3) {
                System.out.println(val);
                break;
            }

            val++; // 다음 숫자로
        }
    }
}