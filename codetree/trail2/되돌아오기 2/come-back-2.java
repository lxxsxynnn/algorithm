import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String commands = sc.next();

        int x = 0;
        int y = 0;

        // 0: 북, 1: 동, 2: 남, 3: 서
        int dir = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int time = 0;
        int answer = -1;

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                dir = (dir + 3) % 4;
            } else if (command == 'R') {
                dir = (dir + 1) % 4;
            } else if (command == 'F') {
                x += dx[dir];
                y += dy[dir];
            }

            time++;

            if (x == 0 && y == 0) {
                answer = time;
                break;
            }
        }

        System.out.print(answer);
    }
}