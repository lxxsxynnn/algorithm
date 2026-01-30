import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dots = new int[3][2];

        for (int i = 0; i < 3; i++) {
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int x = 0;
        int y = 0;
        
        if(dots[0][0] == dots[1][0]) x = dots[2][0];
        else if(dots[0][0] == dots[2][0]) x = dots[1][0];
        else x = dots[0][0];
        
        if(dots[0][1] == dots[1][1]) y = dots[2][1];
        else if(dots[0][1] == dots[2][1]) y = dots[1][1];
        else y = dots[0][1];
        
        System.out.println(x + " " + y);
    }
}
