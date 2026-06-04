import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            nums[i] = sc.nextInt();
            if(i == 2 || i == 4 || i == 9) sum += nums[i];
        }

        System.out.print(sum);
    }
}