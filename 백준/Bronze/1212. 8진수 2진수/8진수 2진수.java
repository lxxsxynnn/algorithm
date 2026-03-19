import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s.equals("0")) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            
            if (i == 0) {
                // 첫 번째 숫자는 앞의 0이 없어야 하므로 내장 함수 사용이 가장 편함
                sb.append(Integer.toBinaryString(digit));
            } else {
                // 두 번째 숫자부터는 직접 3자리씩 계산해서 붙이기
                sb.append(digit / 4);         // 4의 자리 (2^2)
                sb.append((digit % 4) / 2);   // 2의 자리 (2^1)
                sb.append(digit % 2);         // 1의 자리 (2^0)
            }
        }

        System.out.println(sb);
    }
}