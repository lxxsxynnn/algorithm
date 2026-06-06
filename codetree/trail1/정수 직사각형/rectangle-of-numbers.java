import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nums[][] = new int[n][m];

        int k = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                nums[i][j] = k++;
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }
    }
}