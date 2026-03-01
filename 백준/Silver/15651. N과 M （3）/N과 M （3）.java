import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

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

        // 2. 중복을 허용하므로 매번 1부터 N까지 전체 시도
        for (int i = 1; i <= N; i++) {
            arr[depth] = i; 

            dfs(depth + 1); 
        }
    }
}