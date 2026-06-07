import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {

            int star;

            if (i <= N) {
                star = i;
            } else {
                star = 2 * N - i;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
            System.out.println();
        }
    }
}