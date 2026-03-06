import java.io.*;

public class Main {
    static int countRec = 0; // 재귀 호출 횟수
    static int countDp = 0;  // DP 반복 횟수
    static int[] f;          // DP용 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibDP(n);

        // 결과 출력: 재귀 카운트와 DP 카운트를 공백으로 구분
        System.out.println(countRec + " " + countDp);
    }

    // 1. 재귀 방식
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            countRec++; // 코드1 실행 (base case 도달 시)
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    // 2. 동적 계획법 방식
    public static int fibDP(int n) {
        f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            countDp++; // 코드2 실행 (반복문 횟수)
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}