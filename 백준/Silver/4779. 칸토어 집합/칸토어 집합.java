import java.io.*;

public class Main {
    static char[] result; // 전체 선분을 담을 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 입력의 끝(EOF)까지 반복해서 읽기
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            // 1. 선분의 길이 구하기 (3의 N제곱)
            int len = (int) Math.pow(3, N);
            
            // 2. 배열 초기화 및 처음엔 모두 '-'로 채우기
            result = new char[len];
            for (int i = 0; i < len; i++) {
                result[i] = '-';
            }

            // 3. 재귀 함수 시작 (시작 인덱스, 현재 길이)
            solve(0, len);

            // 4. 결과 출력
            StringBuilder sb = new StringBuilder();
            for (char c : result) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }

    public static void solve(int start, int size) {
        // 종료 조건: 길이가 1이면 더 이상 쪼갤 수 없음
        if (size == 1) {
            return;
        }

        // 3등분한 한 칸의 길이
        int newSize = size / 3;

        // 1. 가운데 영역을 공백으로 바꾸기
        // (시작 지점 + 한 칸)부터 (두 칸 지점 전)까지
        for (int i = start + newSize; i < start + 2 * newSize; i++) {
            result[i] = ' ';
        }

        // 2. 왼쪽 영역 재귀 호출
        solve(start, newSize);

        // 3. 오른쪽 영역 재귀 호출 (가운데를 건너뛰고 시작)
        solve(start + 2 * newSize, newSize);
    }
}