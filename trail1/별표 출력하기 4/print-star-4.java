import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 2 * N - 1; i++) {

            int star = Math.abs(i - (N - 1)) + 1;

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}