import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            getSum(arr, a1, a2);
        }
    }

    public static void getSum(int[] arr, int s, int e){
        int sum = 0;

        for(int i = s - 1; i < e; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}