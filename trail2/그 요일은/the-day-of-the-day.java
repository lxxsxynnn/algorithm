import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String A = sc.next();

        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int curDay = 0;

        int count = 0;

        while (true) {
            if (week[curDay].equals(A)) count++;

            if (m1 == m2 && d1 == d2) break;

            d1++;

            if (d1 > month[m1]) {
                m1++;
                d1 = 1;
            }

            curDay = (curDay + 1) % 7;
        }

        System.out.println(count);
    }
}