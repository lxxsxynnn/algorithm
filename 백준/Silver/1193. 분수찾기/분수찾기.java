import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        /*
        * 레벨 1: 분자 + 분모 합이 2 / 1개                        1
        * 레벨 2: 분자 + 분모 합이 3 / 1,2 2,1 2개                2, 3 => (레벨 1, 2 개수 합) - 1
        * 레벨 3: 분자 + 분모 합이 4 / 1,3 2,2 3,1 3개            4, 5, 6 => (레벨 1 ~ 3 개수 합) - 2
        * 레벨 4: 분자 + 분모 합이 5 / 1,4 2,3 3,2 4,1 4개        7, 8, 9, 10 => (레벨 1 ~ 4 개수 합) -3
        *
        * 레벨 N: 분자 + 분모 합이 N + 1 / 해당 구간 분수의 수: N개(레벨 1 ~ N까지 분수 개수의 총합 - N부터 시작)
        *
        * X가 레벨 몇에 해당하는지 구하고, 해당 구간에서 몇 번째인지 찾아야 함 -> idx, (N + 1) - idx 활용
        * N이 홀수일 때는 (N + 1) - idx / idx
        * N이 짝수일 때는 idx / (N + 1) - idx
        * */
        int sum = 1;
        int N = 1;

        while(X > sum) {
            N++;
            sum = sum + N;
        }

        int idx = X - (sum - N);

        if (N % 2 == 0) {
            System.out.println(idx + "/" + (N + 1 - idx));
        } else  {
            System.out.println((N + 1 - idx)+ "/" + idx);
        }
    }
}