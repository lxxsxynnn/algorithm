import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        int idx = 0;

        while(N-- > 0){
            int num = sc.nextInt();
            idx++;

            if(num == 2) cnt++;
            if(cnt == 3){
                System.out.print(idx);
                break;
            }
        }
    }
}