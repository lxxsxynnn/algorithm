import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        // 배열 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        /* 1 2 3 4 5 -> 5개의 숫자가 있음
         * 첫 번째 수와 두 번째 수 비교 -> 최대값 인덱스에 1 저장
         * 두 번째 수와 세 번쨰 수 비교 -> 최대값 인덱스에 2 저장
         * 오른쪽으로 이동하면서 값 비교
         * 최댓값 인덱스는 고정, 비교 대상 인덱스만 + 1
         * 최댓값 인덱스는 0부터 시작
         * 비교대상은 0 + 1 부터 마지막까지
         * */
        // 인덱스를 가지고 최댓값 구하기
        int M = scores[0];
        
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > M) {
                M = scores[i];
            }
        }
        
        // 총합을 저장할 변수 선언
        double sum = 0;

        // 총합 구하기
        for (int i = 0; i < N; i++) {
            sum += (double) scores[i] / M * 100; // 소수자리까지 나오게 실수로 형변환
        }

        //평균 출력하기
        System.out.print(sum / N);
    }
}
