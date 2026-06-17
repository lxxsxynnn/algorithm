import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int cnt = 0;

        for(String str : arr){
            if(str.charAt(str.length() - 1) == c) {
                System.out.println(str);
                cnt++;
            }
        }

        if(cnt == 0) System.out.print("None");
    }
}