import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        
        while(N-- > 0){
            int sum = 0;
            int[] scores = new int[4];

            for(int i = 0; i < 4; i++){
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            if((double) sum / 4 >= 60){
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
    }
}