import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[][] = new int[2][4];

        int totalSum = 0;

        for(int i = 0; i < 2; i++){
            int sum1 = 0;

            for(int j = 0; j < 4; j++){
                nums[i][j] = sc.nextInt();
                sum1 += nums[i][j];
                totalSum += nums[i][j];
            }

            System.out.printf("%.1f ", (double) sum1 / 4);
        }

        System.out.println();

        for(int i = 0; i < 4; i++){
            int sum2 = 0;

            for(int j = 0; j < 2; j++){
                sum2 += nums[j][i];
            }

            System.out.printf("%.1f ", (double) sum2 / 2);
        }

        System.out.printf("\n%.1f", (double) totalSum / 8);
    }
}