import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();

            min = Math.min(nums[i], min);
        }

        int minCnt = 0;

        for(int num : nums){
            if(num == min) minCnt++;
        }

        System.out.print(min + " " + minCnt);
    }
}