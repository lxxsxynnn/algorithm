import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }

        System.out.println(sb.reverse());
    }
}