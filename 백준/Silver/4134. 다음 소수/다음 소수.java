import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                sb.append(2).append("\n");
                continue;
            }

            if (n % 2 == 0) n++; // 홀수부터 시작

            while (!isPrime(n)) {
                n += 2; // 홀수만 검사
            }

            sb.append(n).append("\n");
        }

        System.out.print(sb);
    }

    // Miller–Rabin 소수 판별 (64비트 안전)
    static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        long d = n - 1;
        int s = 0;
        while ((d & 1) == 0) {
            d >>= 1;
            s++;
        }

        long[] bases = {2, 3, 5, 7, 11, 13, 17};
        for (long a : bases) {
            if (a >= n) continue;

            long x = modPow(a, d, n);
            if (x == 1 || x == n - 1) continue;

            boolean composite = true;
            for (int r = 1; r < s; r++) {
                x = mulMod(x, x, n);
                if (x == n - 1) {
                    composite = false;
                    break;
                }
            }
            if (composite) return false;
        }
        return true;
    }

    static long modPow(long a, long d, long mod) {
        long result = 1;
        a %= mod;
        while (d > 0) {
            if ((d & 1) == 1) result = mulMod(result, a, mod);
            a = mulMod(a, a, mod);
            d >>= 1;
        }
        return result;
    }

    static long mulMod(long a, long b, long mod) {
        long result = 0;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) result = (result + a) % mod;
            a = (a * 2) % mod;
            b >>= 1;
        }
        return result;
    }
}
