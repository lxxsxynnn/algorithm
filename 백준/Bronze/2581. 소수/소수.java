import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) divisors.add(j);
            }

            if (divisors.size() == 2) primeList.add(i);
        }

        if(primeList.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int prime: primeList) {
                sum += prime;
            }
            System.out.println(sum);
            System.out.println(primeList.get(0));
        }
    }
}
