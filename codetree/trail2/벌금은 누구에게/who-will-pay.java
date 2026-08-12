import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n];

        int answer = -1;

        for(int i = 0; i < m; i++){
            int f = sc.nextInt();
            students[f - 1]++;
            if(students[f - 1] >= k){
                answer = f;
                break;
            }
        }

        System.out.print(answer);
    }
}