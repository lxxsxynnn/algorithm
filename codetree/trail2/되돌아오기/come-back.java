import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        int totalTime = 0;
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        int x = 0;
        int y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dirNum = 0;
        int time = 0;
        int answer = -1;

        for(int i = 0; i < n; i++){
            switch(dir[i]){
                case 'E':
                    dirNum = 0;
                    break;
                case 'S':
                    dirNum = 1;
                    break;
                case 'W':
                    dirNum = 2;
                    break;
                case 'N':
                    dirNum = 3;
                    break;
            }

            for (int j = 0; j < dist[i]; j++) {
                x += dx[dirNum];
                y += dy[dirNum];
                time++;

                if (x == 0 && y == 0) {
                    answer = time;
                    break;
                }
            }

            if (answer != -1) {
                break;
            }
        }

        System.out.print(answer);
    }
}