import java.io.*;

public class Main {
    // 1. 최대 범위까지 소수 지도 만들기 (에라토스테네스의 체)
    static final int MAX = 1000000;
    static boolean[] isNotPrime = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        makeSieve();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            // 2. n = a + b 형태 찾기 (a는 n/2까지만)
            for (int a = 2; a <= n / 2; a++) {
                if (!isNotPrime[a] && !isNotPrime[n - a]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }

    static void makeSieve() {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}