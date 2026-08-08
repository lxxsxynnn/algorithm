import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[201][201];
        int OFFSET = 100;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x + 8; j++){
                for(int k = y; k < y + 8; k++){
                    arr[j + OFFSET][k + OFFSET] = 1;
                }
            }
        }

        int area = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > 0) area++;
            }
        }

        System.out.print(area);
    }
}