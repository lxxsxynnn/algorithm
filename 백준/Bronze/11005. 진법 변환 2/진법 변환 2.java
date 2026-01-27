import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int mod = N % B;

            if (mod >= 10) {
              sb.append((char) ('A' + mod - 10));
            } else sb.append(mod);
            N /= B;
        }

        System.out.println(sb.reverse());
    }
}