import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int n = 1;

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt() % 42;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[idx] > nums[j]) {
                    idx = j;
                }
            }

            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                n += 1;
            }
        }

        System.out.println(n);
    }
}
