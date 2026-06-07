import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        // 정수 부분 구현하기
        sb.append(A / B).append(".");
        A = (A % B) * 10;

        // 소수점 이하 부분 구현하기
        for(int i = 0; i < 20; i++){
            sb.append(A / B);
            A = (A % B) * 10;
        }

        System.out.println(sb);
    }
}