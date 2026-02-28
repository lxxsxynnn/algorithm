import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;       // 수열을 담을 배열
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        // 깊이 0부터 탐색 시작
        dfs(1, 0);

        System.out.print(sb);
    }

    public static void dfs(int start, int depth) {
        // 1. 종료 조건: 수열의 길이가 M에 도달하면 출력
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 2. 1부터 N까지 숫자를 하나씩 시도
        for (int i = start; i <= N; i++) { // i는 start부터 시작
            arr[depth] = i;
            dfs(i + 1, depth + 1); // 다음 숫자는 현재 숫자보다 큰 것부터
        }
    }
}