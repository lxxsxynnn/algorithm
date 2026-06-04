import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();

        System.out.print(nums[0] + " " + nums[1] + " ");
        
        for(int i = 2; i < nums.length; i++){
            nums[i] = nums[i - 1] + 2 * nums[i - 2];

            System.out.print(nums[i] + " ");
        }
    }
}