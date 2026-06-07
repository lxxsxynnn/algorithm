import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int nums[] = new int[100];
        nums[0] = 1;
        nums[1] = N;

        System.out.print(nums[0] + " " + nums[1] + " ");
        
        for(int i = 2; i < nums.length; i++){
            nums[i] = nums[i - 2] + nums[i - 1];

            System.out.print(nums[i] + " ");

            if(nums[i] > 100) break;
        }
    }
}