import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            ArrayList<Integer> dividors = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    dividors.add(i);
                }
            }

            int sum = 0;
            for(int dividor : dividors) {
                sum += dividor;
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < dividors.size(); i++) {
                    System.out.print(dividors.get(i));
                    if (i != dividors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
