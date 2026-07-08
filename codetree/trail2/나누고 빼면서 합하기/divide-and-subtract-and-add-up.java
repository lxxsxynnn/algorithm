import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        
        System.out.print(getElementSum(m, arr));
    }

    public static int getElementSum(int m, int[] arr){
        int sum = 0;

        while(true){
            sum += arr[m];
            if(m == 1) break;
            m = (m % 2 == 0)? m / 2: m - 1;
        }

        return sum;
    }
}