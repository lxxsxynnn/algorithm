import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        long total = 0;

        for(int i = 1; i < n; i++){
            total += Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
        }

        long min = Long.MAX_VALUE;
        
        for(int i = 1; i < n - 1; i++){
            long before = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1])
            + Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);

            long after = Math.abs(x[i + 1] - x[i - 1]) + Math.abs(y[i + 1] - y[i - 1]);

            long distance = total - before + after;

            
            min = Math.min(min, distance);
        }

        System.out.print(min);
    }
}