import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        int dirNum = 0;

        switch(d){
            case 'R': dirNum = 0; break;
            case 'D': dirNum = 1; break;
            case 'U': dirNum = 2; break;
            case 'L': dirNum = 3; break;
        }

        for(int i = 0; i < t; i++){
            if(r + dx[dirNum] < 1 || r + dx[dirNum] > n ||
            c + dy[dirNum] < 1 || c + dy[dirNum] > n){
                dirNum = 3 - dirNum;
            } else {
                r += dx[dirNum];
                c += dy[dirNum];
            }
        }

        System.out.print(r + " " + c);
    }
}