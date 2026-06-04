import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int num = 0;

        while (true) {
            num += n;
            System.out.print(num + " ");

            if (num % 5 == 0) cnt++;

            if (cnt == 2) break;
        }
    }
}