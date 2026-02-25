import java.io.*;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        
        // 1. 재귀 호출 (시작 행, 시작 열, 크기, 공백 여부)
        drawStar(0, 0, N, false);

        // 2. 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void drawStar(int x, int y, int size, boolean isBlank) {
        // 1. 공백 칸이라면: 해당 영역을 모두 공백으로 채움
        if (isBlank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 2. 종료 조건: 크기가 1이면 별을 찍음
        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        // 3. 9등분하여 재귀 호출
        int newSize = size / 3;
        int count = 0; // 9칸 중 몇 번째 칸인지 세기 위함
        for (int i = x; i < x + size; i += newSize) {
            for (int j = y; j < y + size; j += newSize) {
                count++;
                if (count == 5) { // 5번째 칸(가운데)은 공백
                    drawStar(i, j, newSize, true);
                } else {
                    drawStar(i, j, newSize, false);
                }
            }
        }
    }
}