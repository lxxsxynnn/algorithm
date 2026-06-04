import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
            
            if(i % 2 == 1) evenSum += nums[i];
            else oddSum += nums[i];
        }

        System.out.println(Math.abs(oddSum - evenSum));
    }
}