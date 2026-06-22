import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        char[] arr = s.toCharArray();

        while(q-- > 0){
            int num = sc.nextInt();

            if(num == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                char tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;

                System.out.println(String.valueOf(arr));
            } else {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);

                for(int i = 0; i < arr.length; i++){
                    if(arr[i] == x) arr[i] = y;

                    System.out.print(arr[i]);
                }

                System.out.println();
            }
        }
    }
}