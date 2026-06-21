import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        
        char[] arr = b.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(i == 0 || i == 1) arr[i] = a.charAt(i);

            System.out.print(arr[i]);
        }
    }
}