import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int sum = 0;
        int cnt = 0;
        
        for(String str: arr){
            if(str.charAt(0) == c) {
                cnt++;
                sum += str.length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double) sum / cnt);
    }
}