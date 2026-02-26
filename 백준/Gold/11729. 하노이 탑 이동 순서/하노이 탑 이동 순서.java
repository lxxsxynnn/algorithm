import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 총 이동 횟수 계산 (2^N - 1)
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        // 2. 하노이 재귀 호출 (원판 개수, 시작, 보조, 목표)
        hanoi(N, 1, 2, 3);

        System.out.print(sb);
    }

    /**
     * @param n 원판 개수
     * @param start 시작 기둥
     * @param mid 보조 기둥
     * @param to 목표 기둥
     */
    public static void hanoi(int n, int start, int mid, int to) {
        // 종료 조건: 원판이 1개일 때는 그냥 옮기면 끝
        if (n == 1) {
            sb.append(start).append(" ").append(to).append('\n');
            return;
        }

        // n-1개를 시작(start)에서 보조(mid)로 옮김 (to를 보조로 활용)
        hanoi(n - 1, start, to, mid);

        // 가장 큰 원판 1개를 시작(start)에서 목표(to)로 옮김
        sb.append(start).append(" ").append(to).append('\n');

        // 보조(mid)에 있던 n-1개를 목표(to)로 옮김 (start를 보조로 활용)
        hanoi(n - 1, mid, start, to);
    }
}