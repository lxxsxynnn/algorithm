import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 1) return;

        /*
        * 72 예시
        * 36 ... 2
        * 18 ... 2
        * 9 ... 2로 더이상 나누어지지 않음 -> i값 증가
        * 3 ... 3
        * 3 -> i와 N이 같아지면 종료
        * */

//        int i = 2;
//
//        while (i * i <= N) {
//            if (N % i == 0) {
//                System.out.println(i);
//                N /= i;
//            } else  {
//                i++;
//            }
//        }

        for (int i = 2; i * i <= N;) {
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
            } else i++;
        }

        if (N > 1) {
            System.out.println(N);
        }
    }
}
