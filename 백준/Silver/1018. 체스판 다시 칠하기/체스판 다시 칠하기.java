import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine();
        }

        int minCnt = 64;    //최악의 경우 모든 칸(8 * 8)을 바꿔야 함

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                int cnt = 0;

                for (int row = i; row < i + 8; row++) {
                    for (int col = j; col < j + 8; col++) {
                        char curr = board[row].charAt(col);

                        // board가 WBWBWBWB로 시작한다고 가정하고 바꿔야하는 칸의 수만큼 cnt 증가
                        // 위의 경우를 뒤집는거니까 64에서 cnt를 뺀 값
                        if((row + col) % 2 == 0) {
                            if(curr != 'W') cnt++;
                        } else {
                            if(curr != 'B') cnt++;
                        }
                    }
                }
                int currMin = Math.min(cnt, 64 - cnt);
                if(currMin < minCnt) minCnt = currMin;
            }
        }
        System.out.println(minCnt);
    }
}