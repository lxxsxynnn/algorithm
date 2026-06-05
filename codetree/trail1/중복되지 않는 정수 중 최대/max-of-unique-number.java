import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = -1;

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int cnt = 0;

            for(int j = 0; j < N; j++){
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }

            if(cnt == 1){
                max = Math.max(max, nums[i]);
            }
        }

        System.out.println(max);
    }
}