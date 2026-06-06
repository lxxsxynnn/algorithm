import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                diff = Math.min(Math.abs(nums[i] - nums[j]), diff);
            }
        }

        System.out.print(diff);
    }
}