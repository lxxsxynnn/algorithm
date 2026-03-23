import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            if (line == null) break;

            int N = Integer.parseInt(line);
            BigInteger sum = BigInteger.ZERO; // 0으로 초기화

            for (int j = 0; j < N; j++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            // BigInteger의 signum() 메서드: 음수 -1, 0은 0, 양수 1 반환
            int sign = sum.signum();

            if (sign > 0) sb.append("+");
            else if (sign < 0) sb.append("-");
            else sb.append("0");

            sb.append("\n");
        }
        System.out.print(sb);
    }
}