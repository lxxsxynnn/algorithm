import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        int even = 0;
        int three = 0;

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();

            if(i % 2 == 1) even += nums[i];
            if(i % 3 == 2) three += nums[i];
        }

        System.out.printf("%d %.1f", even, (double)three / 3);
    }
}