import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        // 한 자리 수는 유진수가 될 수 없음
        if (N.length() == 1) {
            System.out.println("NO");
            return;
        }

        boolean isYujin = false;

        // i는 첫 번째 부분의 끝 인덱스 (1부터 시작해서 N.length-1까지)
        for (int i = 1; i < N.length(); i++) {
            String left = N.substring(0, i);
            String right = N.substring(i);

            if (getDigitProduct(left) == getDigitProduct(right)) {
                isYujin = true;
                break;
            }
        }

        System.out.println(isYujin ? "YES" : "NO");
    }

    // 문자열의 각 자릿수 곱을 구하는 함수
    public static long getDigitProduct(String s) {
        long prod = 1;
        for (int i = 0; i < s.length(); i++) {
            prod *= (s.charAt(i) - '0');
        }
        return prod;
    }
}