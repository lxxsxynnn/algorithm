import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] nums = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        while(Q-- > 0){
            int command = sc.nextInt();

            if(command == 1){
                int a = sc.nextInt();
                System.out.println(nums[a - 1]);
            } else if(command == 2){
                int b = sc.nextInt();
                int idx = 0;

                for(int i = 0; i < N; i++){
                    if(nums[i] == b) {
                        idx = i + 1;
                        break;
                    }
                }

                System.out.println(idx);
            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int i = s - 1; i < e; i++){
                    System.out.print(nums[i] + " ");
                }

                System.out.println();
            }
        }
    }
}