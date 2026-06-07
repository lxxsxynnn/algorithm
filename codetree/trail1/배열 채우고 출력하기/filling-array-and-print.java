import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = new char[10];

        for(int i = 0; i < chars.length; i++){
            chars[i] = sc.next().charAt(0);
        }

        for(int i = 9; i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}