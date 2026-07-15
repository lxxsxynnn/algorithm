import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print(getMax(arr));
    }

    public static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > max) max = num;
        }

        return max;
    }
}