import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2001][2001];
        int OFFSET = 1000;

        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (i == 0) {
                        arr[x + OFFSET][y + OFFSET] = 1;
                    } else {
                        // 두 번째 직사각형이 덮은 부분 제거
                        arr[x + OFFSET][y + OFFSET] = 0;
                    }
                }
            }
        }

        int minX = 2001;
        int maxX = -1;
        int minY = 2001;
        int maxY = -1;

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                if (arr[x][y] == 1) {
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        int area = 0;

        if (maxX != -1) {
            area = (maxX - minX + 1) * (maxY - minY + 1);
        }

        System.out.print(area);
    }
}