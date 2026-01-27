import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int value;

            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                value = c - 'A' + 10;
            } else {
                value = c - '0';
            }

            result = result * B + value;
        }

        System.out.println(result);
    }
}