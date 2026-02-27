import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;       // 수열을 담을 배열
    static boolean[] visited; // 방문 여부를 체크할 배열
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];

        // 깊이 0부터 탐색 시작
        dfs(0);
        
        System.out.print(sb);
    }

    public static void dfs(int depth) {
        // 1. 종료 조건: 수열의 길이가 M에 도달하면 출력
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 2. 1부터 N까지 숫자를 하나씩 시도
        for (int i = 1; i <= N; i++) {
            // 아직 방문하지 않은 숫자라면
            if (!visited[i]) {
                visited[i] = true;  // 방문 처리
                arr[depth] = i;     // 현재 깊이(순서)에 숫자 저장
                
                dfs(depth + 1);     // 다음 숫자 고르러 가기 (재귀)

                // 3. 백트래킹: 돌아오면 방문 처리를 다시 해제
                visited[i] = false;
            }
        }
    }
}