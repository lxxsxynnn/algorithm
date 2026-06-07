import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int num = 0;

        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';

            num += (int)Math.pow(2, N.length() - i - 1) * digit;
        }

        System.out.println(num);
    }
}