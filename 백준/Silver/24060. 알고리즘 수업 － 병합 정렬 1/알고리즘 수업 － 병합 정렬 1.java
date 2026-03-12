import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] tmp; // 병합 시 사용할 임시 배열
    static int K;     // 찾고 싶은 저장 순서
    static int count = 0; // 현재 저장 횟수
    static int result = -1; // K번째 저장된 값 (못 찾으면 -1)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(nums, 0, N - 1);
        System.out.print(result);
    }

    // 배열을 쪼개는 함수
    public static void merge_sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // 중간 지점
            merge_sort(A, p, q);     // 전반부 쪼개기
            merge_sort(A, q + 1, r); // 후반부 쪼개기
            merge(A, p, q, r);       // 병합하기
        }
    }

    // 배열을 합치며 정렬하는 함수
    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        // 두 부분 배열을 비교하며 tmp에 정렬하여 담기
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        // 왼쪽 배열이 남은 경우
        while (i <= q) tmp[t++] = A[i++];
        // 오른쪽 배열이 남은 경우
        while (j <= r) tmp[t++] = A[j++];

        // 결과를 원래 배열 A에 복사하며 저장 횟수 체크
        i = p;
        t = 0;
        while (i <= r) {
            count++;
            if (count == K) {
                result = tmp[t];
            }
            A[i++] = tmp[t++];
        }
    }
}