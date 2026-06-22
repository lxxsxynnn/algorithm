import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        char first = arr[0];
        char second = arr[1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == second) arr[i] = first;

            System.out.print(arr[i]);
        }
    }
}