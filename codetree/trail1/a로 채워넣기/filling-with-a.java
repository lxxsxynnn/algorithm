import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(i == 1 || i == arr.length - 2) arr[i] = 'a';

            System.out.print(arr[i]);
        }
    }
}