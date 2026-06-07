import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        int[] nums = new int[100];

        for(int i = 0; i < nums.length; i++){
            int n = sc.nextInt();
            
            if(n == 0){
                idx = i;
                break;
            }

            nums[i] = n;
        }

        int sum = 0;

        for(int i = idx - 3; i < idx; i++){
            sum += nums[i];
        }
        
        System.out.println(sum);
    }
}