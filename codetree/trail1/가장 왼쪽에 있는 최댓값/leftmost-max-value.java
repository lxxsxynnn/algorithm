import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        int idx = N;

        while(true){
            int maxIdx = 0;

            for(int i = 0; i < idx; i++){
                if(nums[i] > nums[maxIdx]) maxIdx = i;
            }

            System.out.print(maxIdx + 1 + " ");

            if(maxIdx == 0) break;

            idx = maxIdx;
        }
    }
}