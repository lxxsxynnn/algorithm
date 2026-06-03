import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n == 0) {
                System.out.printf("%d %.1f", sum, (double)sum / i);
                return;
            }
            nums[i] = n;
            sum += nums[i];
        }

        System.out.printf("%d %.1f", sum, (double)sum / 10);
    }
}