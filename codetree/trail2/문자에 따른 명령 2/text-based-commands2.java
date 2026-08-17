import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0, y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dirNum = 3;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L') dirNum = (dirNum - 1 + 4) % 4;
            else if(s.charAt(i) == 'R') dirNum = (dirNum + 1) % 4;
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.print(x + " " + y);
    }
}