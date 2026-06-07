import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = N - 1; i >= 0; i--){
            nums[i] = sc.nextInt();
        }

        for(int num : nums){
            if(num % 2 == 0) System.out.print(num + " ");
        }
    }
}