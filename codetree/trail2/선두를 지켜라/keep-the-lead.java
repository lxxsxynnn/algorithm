import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] veloA = new int[n];
        int[] timeA = new int[n];

        int[] veloB = new int[m];
        int[] timeB = new int[m];

        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            veloA[i] = sc.nextInt();
            timeA[i] = sc.nextInt();
            totalTime += timeA[i];
        }

        for (int i = 0; i < m; i++) {
            veloB[i] = sc.nextInt();
            timeB[i] = sc.nextInt();
        }

        int idxA = 0;
        int idxB = 0;

        int remainA = timeA[0];
        int remainB = timeB[0];

        int posA = 0;
        int posB = 0;

        // 현재 선두
        // 1 : A
        // -1 : B
        // 0 : 공동 선두
        int leader = 0;
        int cnt = 0;

        for (int t = 0; t < totalTime; t++) {

            // A 이동
            posA += veloA[idxA];
            remainA--;

            if (remainA == 0 && idxA + 1 < n) {
                idxA++;
                remainA = timeA[idxA];
            }

            // B 이동
            posB += veloB[idxB];
            remainB--;

            if (remainB == 0 && idxB + 1 < m) {
                idxB++;
                remainB = timeB[idxB];
            }

            // 현재 선두 확인
            int newLeader;

            if (posA > posB) {
                newLeader = 1;
            } else if (posA < posB) {
                newLeader = -1;
            } else {
                newLeader = 0;
            }

            // 공동 선두였다가 누군가 앞서면 선두 변경
            if (leader != 0 && newLeader != 0 && leader != newLeader) {
                cnt++;
            }

            // 공동 선두 상태에서는 선두가 바뀐 것으로 보지 않음
            if (newLeader != 0) {
                leader = newLeader;
            }
        }

        System.out.println(cnt);
    }
}