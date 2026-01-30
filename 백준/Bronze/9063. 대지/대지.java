import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dots = new int[N][2];

        for(int i = 0; i < N; i++){
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        for(int i = 1; i < N; i++){
            if(dots[i][0] < minX) minX = dots[i][0];
            if(dots[i][1] < minY) minY = dots[i][1];
            if(dots[i][0] > maxX) maxX = dots[i][0];
            if(dots[i][1] > maxY) maxY = dots[i][1];
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
