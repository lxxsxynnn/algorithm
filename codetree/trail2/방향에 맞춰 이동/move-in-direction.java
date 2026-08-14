import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dx = 0;
        int dy = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            if (direction == 'E') {
                dx += distance;
            } else if (direction == 'W') {
                dx -= distance;
            } else if (direction == 'N') {
                dy += distance;
            } else if (direction == 'S') {
                dy -= distance;
            }
        }

        System.out.println(dx + " " + dy);
    }
}