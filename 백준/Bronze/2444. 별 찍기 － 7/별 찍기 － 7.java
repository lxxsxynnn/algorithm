import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 2 * N - 1; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < 2 * N - 1; j++) {
                if (Math.abs(N - 1 - i) + Math.abs(N - 1 - j) < N) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }

            System.out.println(sb.toString().stripTrailing());
        }
    }
}
