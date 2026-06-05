import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            } else if(nums[i] > max2){
                max2 = nums[i];
            }
        }

        System.out.print(max1 + " " + max2);
    }
}