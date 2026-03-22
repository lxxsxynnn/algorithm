import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 비어있는지 체크할 배열 (처음엔 모두 비어있다고 가정: true)
        boolean[] rowCheck = new boolean[N];
        boolean[] colCheck = new boolean[M];
        Arrays.fill(rowCheck, true);
        Arrays.fill(colCheck, true);

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowCheck[i] = false; // 경비원이 있으므로 비어있지 않음
                    colCheck[j] = false;
                }
            }
        }

        int rowCount = 0;
        for (boolean b : rowCheck) if (b) rowCount++;

        int colCount = 0;
        for (boolean b : colCheck) if (b) colCount++;

        System.out.println(Math.max(rowCount, colCount));
    }
}