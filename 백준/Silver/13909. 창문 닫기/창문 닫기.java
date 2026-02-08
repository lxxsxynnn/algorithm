import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        // N까지의 숫자 중 제곱수의 개수는 sqrt(N)개
        // Math.sqrt()는 double을 반환하므로 (long)으로 형변환
        long result = (long) Math.sqrt(N);

        System.out.println(result);
    }
}