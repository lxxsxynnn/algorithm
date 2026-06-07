import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[100];
        int idx = 0;

        while(true){
            int a = sc.nextInt();

            if(Math.abs(a) == 999) break;

            nums[idx] = a;
            idx++;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < idx; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        System.out.print(max + " " + min);
    }
}