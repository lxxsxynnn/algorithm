import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            /*
             * 5 4 -> 1 2 3 4 5 (초기화)
             * 1 2 -> 2 1 3 4 5
             *                   [i - 1] => [j - 1]로 이동, [j - 1] => [i - 1]로 이동
             * 3 4 -> 2 1 4 3 5
             *                   [i - 1] => [j - 1]로 이동, [j - 1] => [i - 1]로 이동
             * 1 4 -> 3 4 1 2 5
             *                   [i - 1] => [j - 1]로 이동, [j - 1] => [i - 1]로 이동
             *                   [i] => [j - 2]로 이동, [j - 2] => [i]로 이동
             *                   ** i는 + 1, j는 - 1 (i는 2가 되고 j는 3 그 다음엔 i가 3, j는 2라서 반복 종료)
             * 2 2 -> 3 4 1 2 5
             * */
            while(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
