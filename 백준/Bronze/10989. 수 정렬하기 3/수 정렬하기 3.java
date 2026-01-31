import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        // 1. 숫자의 범위(1~10,000)만큼만 배열을 생성 (메모리 절약)
        int[] counts = new int[10001];

        // 2. 입력받은 숫자를 인덱스로 사용하여 개수만 카운트
        for (int i = 0; i < N; i++) {
            counts[Integer.parseInt(br.readLine())]++;
        }

        // 3. 출력 최적화: StringBuilder 대신 바로 BufferedWriter 사용 권장
        // (StringBuilder도 1,000만 개를 쌓으면 메모리 초과 위험이 있음)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 1; i <= 10000; i++) {
            // 해당 숫자가 나온 횟수만큼 반복 출력
            while (counts[i] > 0) {
                bw.write(i + "\n");
                counts[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}