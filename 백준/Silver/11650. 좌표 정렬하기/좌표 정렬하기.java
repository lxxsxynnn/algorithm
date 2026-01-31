import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dots = new int[N][2];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dots, (e1, e2) -> {
            if (e1[0] == e2[0]) {      // 1. 만약 X좌표가 같다면?
                return e1[1] - e2[1];  //    Y좌표를 뺀 값을 돌려주기 (Y 기준 정렬)
            } else {                   // 2. X좌표가 다르다면?
                return e1[0] - e2[0];  //    X좌표를 뺀 값을 돌려주기 (X 기준 정렬)
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(dots[i][0] + " " + dots[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}