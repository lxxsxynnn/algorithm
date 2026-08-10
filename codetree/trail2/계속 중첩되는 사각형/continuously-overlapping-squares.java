import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];
        int OFFSET = 100;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(i % 2 == 0) arr[j + OFFSET][k + OFFSET] = 0;
                    else arr[j + OFFSET][k + OFFSET] = 1;
                }
            }
        }
        
        int area = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1) area++;
            }
        }

        System.out.print(area);
    }
}