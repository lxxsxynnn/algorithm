import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2001][2001];
        int OFFSET = 1000;

        for(int i = 0; i < 3; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int n = x1; n < x2; n++){
                for(int m = y1; m < y2; m++){
                    if(i != 2){
                        arr[n + OFFSET][m + OFFSET] = 1;
                    } else {
                        arr[n + OFFSET][m + OFFSET] = -1;
                    }
                }
            }
        }

        int area = 0;

        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                if(arr[i][j] == 1) area++;
            }
        }

        System.out.print(area);
    }
}