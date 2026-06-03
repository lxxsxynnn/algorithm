import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n == 0) break;

            nums[i] = n;
            
            if(n % 2 == 0) {
                sum += nums[i];
                cnt++;
            }
        }

        System.out.printf(cnt + " " + sum);
    }
}