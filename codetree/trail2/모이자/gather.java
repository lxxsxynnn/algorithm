import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;

        for(int i = 0; i < n; i++){
            long diffSum = 0;

            for(int j = 0; j < n; j++){
                diffSum += (long) a[j] * Math.abs(i - j);
            }

            if(diffSum < min) min = diffSum;
        }

        System.out.print(min);
    }
}