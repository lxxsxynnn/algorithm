import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 운동할 시간
        int m = Integer.parseInt(st.nextToken());   // 초기 맥박
        int M = Integer.parseInt(st.nextToken());   // 최대 맥박
        int T = Integer.parseInt(st.nextToken());   // 운동을 할 때 증가하는 맥박
        int R = Integer.parseInt(st.nextToken());   // 운동을 쉴 때 감소하는 맥박

        if (m + T > M) {
            System.out.println(-1);
            return;
        }

        int exerciseTime = 0; // 실제로 운동한 시간
        int totalTime = 0;    // 전체 소요 시간
        int currentPulse = m;

        while (exerciseTime < N) {
            totalTime++;

            // 운동을 할 수 있는 경우
            if (currentPulse + T <= M) {
                currentPulse += T;
                exerciseTime++;
            }
            // 운동을 못 해서 쉬어야 하는 경우
            else {
                currentPulse -= R;
                // 맥박이 초기 맥박 m보다 낮아지면 m으로 고정
                if (currentPulse < m) currentPulse = m;
            }
        }

        System.out.print(totalTime);
    }
}